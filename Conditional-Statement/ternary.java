import java.util.*;
public class Conditional_Statement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      //Ternary Operator:
       int number=4;
       String type=((number%2)==0)?"even":"odd";
       System.out.println(type);

       //Check if a student Pass or Fail.
       int marks=50;
       String reportCard=marks>=33?"PASS":"FAIL";
       System.out.println(reportCard);
