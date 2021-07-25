public class Arithmetic {
    private static int number1;
    private static int number2;

    public Arithmetic(int num1, int num2){
        number1 = num1;
        number2 = num2;
    }

    public static int sumNumbers(){
        return number1 + number2;
    }

    public static int multiplicationNumbers(){
        return number1 * number2;
    }

    public static void findMaxNumber(){
        if (number1 > number2) System.out.println("Max number is " + number1);
        else if (number1 < number2) System.out.println("Max number is " + number2);
        else System.out.println("Numbers are equal");
    }

    public static void findMinNumber(){
        if (number1 > number2) System.out.println("Max number is " + number2);
        else if (number1 < number2) System.out.println("Min number is " + number1);
        else System.out.println("Numbers are equal");
    }

}