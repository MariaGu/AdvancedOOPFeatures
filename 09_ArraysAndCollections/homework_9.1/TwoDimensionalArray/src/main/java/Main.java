public class Main {
    public static void main(String[] args) {
        int sizeOfCross = 5;
        char[][] cross = TwoDimensionalArray.getTwoDimensionalArray(sizeOfCross);
        for (char[] crossLines: cross){
            System.out.println(crossLines);
        }

    }
}
