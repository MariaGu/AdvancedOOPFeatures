public class ArithmeticTest {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(10,100);
        System.out.println(arithmetic.sumNumbers());
        System.out.println(arithmetic.multiplicationNumbers());
        arithmetic.findMaxNumber();
        arithmetic.findMinNumber();
    }
}
