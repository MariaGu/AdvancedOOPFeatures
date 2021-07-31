public class ContainerTest {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        String russianLetters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        for (int i = 0; i < russianLetters.length(); i++){
            char c = russianLetters.charAt(i);
            System.out.println(c + " соотвествует коду " + (int) c);
        }
    }
}
