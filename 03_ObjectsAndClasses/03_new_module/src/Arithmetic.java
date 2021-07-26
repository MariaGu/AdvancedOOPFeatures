public class Arithmetic {
    private  int number1;
    private  int number2;

    public Arithmetic(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sumNumbers(){
        return number1 + number2;
    }

    public int multiplicationNumbers(){
        return number1 * number2;
    }

    public void findMaxNumber(){
        if (number1 > number2) System.out.println("Max number is " + number1);
        else if (number1 < number2) System.out.println("Max number is " + number2);
        else System.out.println("Numbers are equal");
    }

    public void findMinNumber(){
        if (number1 > number2) System.out.println("Max number is " + number2);
        else if (number1 < number2) System.out.println("Min number is " + number1);
        else System.out.println("Numbers are equal");
    }

}