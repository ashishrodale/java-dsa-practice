import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;

        System.out.println("\nNumbers from 1 to " + n + " using Do-While Loop:");

        do {
            System.out.println(i);
            i++;
        } while (i <= n);

        sc.close();
    }
}
