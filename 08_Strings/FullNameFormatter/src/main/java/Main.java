import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }

      if (isOkStatement(input)) printName(input);
    }
    }

    public static boolean isOkStatement(String input){
        int numberOfSpaces = 0;
        boolean isOKStatement;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') numberOfSpaces++;
            isOKStatement = ('А' <= input.charAt(i) && input.charAt(i) <= 'я') ||
                    (input.charAt(i) == ' ')
                    || (input.charAt(i) == '-');
            if (!isOKStatement) {
                System.out.println("Введенная строка не является ФИО");
                return false;
            }
        }
        if (numberOfSpaces != 2) {
            System.out.println("Введенная строка не является ФИО");
            return false;
        }
        return true;
    }

    public static void printName(String input){
        String family = input.substring(0, input.indexOf(' '));
        String name = input.substring(input.indexOf(' ')+1, input.lastIndexOf(' '));
        String secondName = input.substring(input.lastIndexOf(' ')+1);

        System.out.println("Фамилия: " + family + System.lineSeparator());
        System.out.println("Имя: " + name + System.lineSeparator());
        System.out.println("Отчество: " + secondName + System.lineSeparator());
    }
}