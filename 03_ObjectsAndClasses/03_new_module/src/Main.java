public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        System.out.println(basket.getTotalWeight());
        basket.add("Meat", 100, 2, 1500.0);
        System.out.println(basket.getTotalWeight());
    }
}
