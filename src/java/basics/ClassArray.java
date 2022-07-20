package java.basics;

import java.util.Arrays;

public class ClassArray {

    public static void main(String[] args) {

        System.out.println("Array Declaration and initialisation");
        //type [] name_var = {elements}
        //1
        int [] myArray ={1,15,8};
        //2 NOT good
        int mArray [] = {4, 5};
        //3
        int[] Arra = new int[]{1,7,4};

       //Access Array value using index
        System.out.println("hascode:class Java +@+identityHashCode : "+myArray);
        System.out.println(myArray[1]);

        System.out.println("print Array elemnts using while loop");
        int i=0 ;
        while(i< myArray.length){
            System.out.println(myArray[i]);
            i++ ;

        }

        System.out.println("print Array elemnts using for loop first");
        //for (intialisation ; condition ; incrt)
        for (int index=0 ; index < myArray.length ; index++){
            System.out.println(myArray[index]);

        }

        System.out.println("print Array elemnts using for loop second");

        /* for (type element : myvariable) : goes to each elment in my variable and print it*/

        for (int element:myArray){
            System.out.println(element);
        }


    }
}
