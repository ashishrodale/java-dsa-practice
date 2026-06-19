//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;
public class AQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Creating scanner object for user input.
        System.out.println("Enter a number:");
        int number = sc.nextInt();           // TAking input from user

        if(number>0){
            System.out.println("The number is positive");
        }
        else if(number<0){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("The number is 0");
        }

    }
}
