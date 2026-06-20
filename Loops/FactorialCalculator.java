// Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class AQ3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Factorial does not exist for negative number");
        }else{
            long factorial = 1;   //Using long to handle largeer value.
            for(int i=1;i<=num;i++){
                factorial *= i;
            }
            System.out.println("Factorial of number is : " + factorial);
        }

    }
    
}
