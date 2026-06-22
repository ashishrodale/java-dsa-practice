import java.util.*;
public class sumOfDigits{

    //Function to calculate sum of digits
    public static int sumOfDigits(int num){
        int sum = 0 ;

        while(num>0 ){
            int digit = num % 10;           //Get last digit.
            sum += digit;   //Add digit to sum
            num = num / 10;              //Removes last digit
        }
        return sum;   //Compare original and reversed.
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:  ");
        int num = sc.nextInt();

        System.out.println("Sum of digits of " + num + " = " + sumOfDigits(num));
    }
}
