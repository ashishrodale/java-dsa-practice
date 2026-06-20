//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.*;
public class AQ2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int evenSum = 0,oddSum = 0;
        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + "integers:");

        for(int i =0; i<n; i++){
            int num = sc.nextInt();
            if(num % 2==0)
                evenSum += num;
            else
                oddSum += num;

        }  
        System.out.println("Sum of even numbers: "+ evenSum);
        System.out.println("Sum of odd numbers: "+ oddSum);

    }
}
