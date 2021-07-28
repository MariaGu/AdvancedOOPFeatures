public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        System.out.println(basket.getTotalWeight());
        basket.add("Meat", 100, 2, 1500.0);
        System.out.println(basket.getTotalWeight());
        System.out.println(Basket.getCount());
        Basket.getAveragePriceOfProduct();
        Basket.getAveragePriceOfBasket();
        Basket mashaBasket = new Basket();
        mashaBasket.add("Sugar", 100, 3, 2000.0);
        System.out.println(Basket.getCount());
        Basket.getAveragePriceOfProduct();
        Basket.getAveragePriceOfBasket();
    }
}
