//Write a Java program that takes a year from the user and print whether that year is a leap year or not

import java.util.*;
public class Leap_year{
    public static void main(String args[]){
        //Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);

        //Ask the user to enter a year.
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        //Check if the year is a leap year or not.
        if((year%4==0 && year %100 !=0) || (year%4==0)){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
