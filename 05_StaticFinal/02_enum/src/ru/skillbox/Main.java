package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator mashaCalculator  = new ArithmeticCalculator(15, 45);
        mashaCalculator.calculate(Operation.ADD);
        mashaCalculator.calculate(Operation.MULTIPLY);
        mashaCalculator.calculate(Operation.SUBTRACT);
    }
}
