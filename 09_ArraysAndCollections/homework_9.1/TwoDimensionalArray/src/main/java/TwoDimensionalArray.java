public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] cross = new char[size][size];
        for (int i = 0; i < cross.length; i++) {
            for (int j = 0; j < cross[i].length; j++) {
                cross[i][j] = (i == j || j == cross.length - i - 1) ? symbol : ' ';
            }
        }
        return cross;
    }
}
