public class AshishPattern {
    public static void main(String[] args) {
        for (int row = 0; row < 7; row++) {

            // A
            for (int col = 0; col < 5; col++) {
                if ((col == 0 || col == 4) && row != 0 ||
                    row == 0 && col > 0 && col < 4 ||
                    row == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // S
            for (int col = 0; col < 5; col++) {
                if ((row == 0 || row == 3 || row == 6) ||
                    (col == 0 && row < 3) ||
                    (col == 4 && row > 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // H
            for (int col = 0; col < 5; col++) {
                if (col == 0 || col == 4 || row == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // I
            for (int col = 0; col < 5; col++) {
                if (row == 0 || row == 6 || col == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // S
            for (int col = 0; col < 5; col++) {
                if ((row == 0 || row == 3 || row == 6) ||
                    (col == 0 && row < 3) ||
                    (col == 4 && row > 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // H
            for (int col = 0; col < 5; col++) {
                if (col == 0 || col == 4 || row == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
