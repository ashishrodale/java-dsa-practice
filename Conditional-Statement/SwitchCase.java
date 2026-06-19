//Write a Java program to input week number(1-7) and print day of week name using switch case

import java.util.*;
public class Switches{
    public static void main(String args[]){
        //Create scanner object for input.
        Scanner sc = new Scanner(System.in);
        
        //Prompt user to enter a week number.
        System.out.println("Enter a week number(1-7): ");
        int weekNumber = sc.nextInt();

        //use switch to print corresponding day name.
        switch(weekNumber){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
            default:System.out.println("Wrong input!");
        }


    }
}
