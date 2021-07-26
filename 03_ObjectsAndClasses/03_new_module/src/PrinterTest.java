public class PrinterTest {
    public static void main(String[] args) {
        Printer mashaPrinter = new Printer();
        mashaPrinter.print();
        mashaPrinter.append("BookAboutFarytales");
        mashaPrinter.print();
        System.out.println("Pages, which were printed: " + mashaPrinter.getPrintedPagesCount());
        mashaPrinter.append("BookAboutSun", "BookSun", 200);
        System.out.println("Pages, to be printed: " + mashaPrinter.getPendingPagesCount());
        mashaPrinter.print();
        mashaPrinter.append("BookAboutMoon", "BookMoon", 1400);
        mashaPrinter.print();
        System.out.println("Pages, which were printed: " + mashaPrinter.getPrintedPagesCount());
    }
}
