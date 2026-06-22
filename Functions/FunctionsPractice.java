import java.util.*;
public class Function{
    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1,int num2){ 
        int sum = num1+num2;
        return sum;

    }

    public static void  swap(int a ,int b){
        //Swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A is : "+ a);
        System.out.println("B is : "+ b);

    }

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static int  factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        f = f*i;
        return f;//factorial of n

    }

    public static int binCoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binCoeff= fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }

    //function to calculate sum of 2 numbers.
    public static int sum(int a, int b){
        return a+b;
    }

    //function to calculate sum of 3 number.
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    //function to calculate float sum
    public static float sum(float a,float b){
        return a+b;
    }

    public static boolean isPrime(int n){
        //corner cases
        //2
         if(n==2){
             return true;
         }
         boolean isPrime = true;
         for(int i=2;i<=n-1; i++){
             if(n%i==0) {//completely dividing
                isPrime=false;
                break;
             }
         }
         return isPrime; 
    }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2; i<=n;i++){
            if(isPrime(i)){ //true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit= binNum%10;
            decNum =  decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("deciaml of "+ myNum +"=" +decNum);
    }

    public static void decToBin(int n){
        int pow=0;
        int binNum=0;
        int myNum=n;

        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+ myNum +"="+binNum);
    }
    public static void main(String args[]){
        decToBin(7);


        
    }
}
