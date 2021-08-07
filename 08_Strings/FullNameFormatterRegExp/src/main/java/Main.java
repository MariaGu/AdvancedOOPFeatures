import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            if (isValidName(input)) printName(input);
        }
    }

    public static boolean isValidName(String input) {
        String symbolsForName = "[АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя-]+";
        String regex = symbolsForName + "[ ]+" + symbolsForName + "[ ]+" + symbolsForName;
        if (!input.matches(regex)) System.out.println("Введенная строка не является ФИО");
        return input.matches(regex);
    }

    public static void printName(String input) {
        String[] words = input.split(" +");
        System.out.println("Фамилия: " + words[0] + System.lineSeparator());
        System.out.println("Имя: " + words[1] + System.lineSeparator());
        System.out.println("Отчество: " + words[2] + System.lineSeparator());
    }
}