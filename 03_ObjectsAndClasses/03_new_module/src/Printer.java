public class Printer {
    private String queue = "";
    private int pendingPagesCount = 0;
    private int printedPagesCount = 0;

    public void append(String text, String name, int numberPages) {
        queue = queue + "\n" + "text - " + text + "\n" + "name - " + name + "\n" + "number of pages - " + numberPages;
        pendingPagesCount += numberPages;
    }

    public void append(String text, String name) {
        queue = queue + "\n" + "text - " + text + "\n" + "name - " + name;
    }

    public void append(String text) {
        queue = queue + "\n" + "text - " + text;
    }

    public void clear() {
        queue = "";
        pendingPagesCount = 0;
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("My queue: " + queue);
            printedPagesCount += pendingPagesCount;
        }
        clear();
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public int getPrintedPagesCount() {
        return printedPagesCount;
    }

}


