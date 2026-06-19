//Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever


import java.util.*;
public class Fevercheck{
    public static void main(String args[]){
        double temp = 103.5;
        if(temp>100){
            System.out.println("you are having fever :" + temp);
        }
        else{
            System.out.println("Don't worry you do not have fever");
        }

    }
}
