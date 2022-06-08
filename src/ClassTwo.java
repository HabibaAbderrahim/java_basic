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

        System.out.println("**********************LOGICAL OPERATIONS****************************");
        //and : &&      or: ||
        //check more than one condition using same if
        //[1..100]
        if((a>=1) && (a<=100)){
            System.out.println(" Great !Number " +a+ " is between [1..100]");
        }

        System.out.println("**********************SWITCH STATEMENT****************************");
        //multiple expression to check
        //byte , short , char , int ...
        char grade='A' ;
        switch (grade){

            case 'A' :
                System.out.println("VERY GOOD");
                break;
            case 'B' :
                System.out.println("GOOD");
                break;
            case 'C' :
                System.out.println("HARD LUCK");
                break;
                //when all condition are not meet
            default:
                System.out.println("");
                break;

        }

    }
}
