public class NestedLoop {

    static final int MAX = 8;

    public static void main(String[] args) {
        int row, column;

        for (row = 0; row <= MAX; row++) {
                for (column = 0; column <= MAX; column++) {
                    System.out.println(row +row );
                }
            System.out.println(row+1); //Takes us to the next line
        }
    }
}
