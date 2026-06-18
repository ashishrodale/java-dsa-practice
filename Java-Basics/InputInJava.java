import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Double input
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("\n----- User Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);

        sc.close();
    }
}
