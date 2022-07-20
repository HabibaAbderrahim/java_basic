package java.basics;

import java.util.Arrays;

public class ClassMethods {

    public static void main(String[] args) {
        //Call the Function
        myFunction();
        int s = sum(10,5);
        //Call the Function
        System.out.println("summation = " + s);
    }

    //Create your First Function
    public static void myFunction(){
        System.out.println("This a function");
    }
    //parameter passing and returning
    public static int sum(int a , int b){
        return a+b ;
    }
}
