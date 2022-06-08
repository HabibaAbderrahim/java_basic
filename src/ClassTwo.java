import java.util.Arrays;
import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {
        System.out.println("**********************CONDITIONAL STATEMENTS****************************");
        System.out.println("**********************IF ELSE****************************");
        /*
        if(condition_expression)
        {
           execute if the condition is true
        }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();

        if(a == 10){
            System.out.println("a == 10");

        }else {
            System.out.println("a != 10 ");
        }
    }
}
