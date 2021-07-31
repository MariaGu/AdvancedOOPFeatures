import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int numberBoxes = Integer.parseInt(boxes);
        int boxesInContainer = 27;
        int containersInTruck = 12;
        int boxesInTruck = boxesInContainer * containersInTruck;
        int numberContainers = ((numberBoxes % boxesInContainer) == 0) ? numberBoxes / boxesInContainer : 1 + (numberBoxes / boxesInContainer);
        int numberTrucks = (numberBoxes % boxesInTruck) == 0 ? numberBoxes / boxesInTruck : 1 + numberBoxes / boxesInTruck;

        int k = 1;
        int j = 1;
        for (int i = 1; i <= numberTrucks; i++) {
            System.out.println("Грузовик: " + i);
            for (; j <= numberContainers; j++) {
                System.out.println("\tКонтейнер: " + j);
                for (; k <= numberBoxes; k++) {
                    System.out.println("\t\tЯщик: " + k);
                    if (k % 27 == 0) {
                        k++;
                        break;
                    }

                }
                if (j % 12 == 0) {
                    j++;
                    break;
                }
            }
        }

        System.out.println("Необходимо:" + System.lineSeparator()
                + "грузовиков - " + numberTrucks + " шт." + System.lineSeparator()
                + "контейнеров - " + numberContainers + " шт." + System.lineSeparator());

    }
}