import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int numberBoxes = Integer.parseInt(boxes);
        final int BOXES_IN_CONTAINERS = 27;
        final int CONTAINERS_IN_TRUCK = 12;
        int numberTrucks = 0;
        int numberContainers = 0;

        for (int i = 1; i <= numberBoxes; i++) {
            if ((i == 1) ||  (((i-1) % (BOXES_IN_CONTAINERS * CONTAINERS_IN_TRUCK)) == 0)) {
                System.out.println("Грузовик: " + ++numberTrucks);
            }
            if ((i == 1) ||  (((i-1) % BOXES_IN_CONTAINERS) == 0)) {
                System.out.println("\tКонтейнер: " + ++numberContainers);
            }
            System.out.println("\t\tЯщик: " + i);
        }

        System.out.println("Необходимо:" + System.lineSeparator()
                + "грузовиков - " + numberTrucks + " шт." + System.lineSeparator()
                + "контейнеров - " + numberContainers + " шт." + System.lineSeparator());
    }
}