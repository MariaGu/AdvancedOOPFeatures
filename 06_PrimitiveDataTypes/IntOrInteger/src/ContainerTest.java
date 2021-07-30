public class ContainerTest {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for (int i = 1040; i < 1106; i++){
            if (i == 1104) continue;
            char c = (char) i;
            System.out.println(i + " - " + c);
        }
        System.out.println("1025 - " + (char) 1025);
    }
}
