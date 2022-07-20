package java.basics;

import java.util.Arrays;

public class ClassLoops {
    public static void main(String[] args) {

        System.out.println("************* while statement *****************");
        int a = 10;
        while (a >= 1){
            System.out.println(a);
            a-- ;
        }

        System.out.println("************* do while loop VS while loop *****************");
         int c = 0;
         while(c<=-1){
             System.out.println(c);
             c++;
         }
         //condition then execute
        System.out.println("The while didn't execute the satetement since 0 never <= -1");

        int b = 0 ;
         do {
             System.out.println(b);
             b++;
         }while (b <= -1);
        System.out.println("The do while execute at least ONCE the satetement");
         //execute then check condition

    }
}
