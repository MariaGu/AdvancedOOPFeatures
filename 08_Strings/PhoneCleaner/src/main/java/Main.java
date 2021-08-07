import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            String regex1 = "[^0-9]";
            input = input.replaceAll(regex1, "");
            String regex2 = "[78]?[0-9]{10}";
            if (!input.matches(regex2)) {
                System.out.println("Неверный формат номера");
            } else {
                String regex3 = "[8][0-9]{10}";
                String regex4 = "[8]";
                if (input.matches(regex3)) {
                    input = input.replaceFirst(regex4, "7");
                }
                String regex5 = "[0-9]{10}";
                if (input.matches(regex5)) {
                    input = 7 + input;
                }
                System.out.println(input);
            }
        }
    }
}
