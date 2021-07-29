package ru.skillbox;

public class ArithmeticCalculator {
    private final int number1; // "final" because no opportunity to change it in Class
    private final int number2; // "final" because no opportunity to change it in Class

    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // so don't i need to declare "Operation operation" in Class as long as I use in only in "calculate" method?
    public void calculate(Operation operation) {
        switch (operation) {
            case ADD:
                System.out.println(number1 + number2);
                break;
            case SUBTRACT:
                System.out.println(number1 - number2);
                break;
            case MULTIPLY:
                System.out.println(number1 * number2);
                break;
        }
    }
}

