//Write a program to print multiplication table of a number N, entered by the user.
import java.util.*;
public class Tables{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table : ");
        int n= sc.nextInt();

        System.out.println("Multiplication table of "+ n + ":");
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
        
    }
    
}
