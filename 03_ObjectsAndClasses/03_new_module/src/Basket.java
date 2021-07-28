public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int totalAllBasketPrice = 0;
    private static int totalProductCount = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public double getTotalWeight(){
        return totalWeight;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count, double weight){
        add(name, price, count);
        totalWeight += weight;
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        increaseTotalAllBasketPrice(price, count);
        increaseTotalProductCount(count);
    }

    public static void increaseTotalAllBasketPrice(int price, int count){
        Basket.totalAllBasketPrice += price * count;
    }

    public static void increaseTotalProductCount(int count){
        Basket.totalProductCount += count;
    }

    public static void getAveragePriceOfProduct(){
        if (totalProductCount == 0){
            System.out.println("Operation is impossible");
            return;
        }
        System.out.println((double) totalAllBasketPrice / totalProductCount);
    }

    public static void getAveragePriceOfBasket(){
        if (count == 0){
            System.out.println("Operation is impossible");
            return;
        }
        System.out.println((double) totalAllBasketPrice / count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}