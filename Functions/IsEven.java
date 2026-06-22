import java.util.*;
public class isEven{

    //Method to check if a number is even.
    public static boolean isEven(int num){
        return num%2 == 0;  //returns true if divisible by 2
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:  ");
        int num = sc.nextInt();

        // Test the isEven method
        if (isEven(num)){
            System.out.println(num + " is even.");
        }else{
            System.out.println(num +" is odd.");
        }
    }
}
