public class NestedLoop {

    public static void main(String[] args) {
        int row, column;
        int max = 9;

        for (row = 1; row <= max; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print(row);
            }
            System.out.println(); //Takes us to the next line
        }
    }
}
