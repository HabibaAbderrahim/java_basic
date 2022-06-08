import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) throws IOException {

        System.out.println("********************************variable Declaration**************************");

        //typeOfVariable variable_name
        String name = "john" ;
        System.out.println(name);

        //Float(4bits) Vs double(8bits)
        double myNumb = 4.45 ;
        // Natively double stores float we need typeCasting ()
        float myFloat = (float) 3.2;


        System.out.println("********************************Get user input**************************");


        System.out.println("First");
        int i;
        i = System.in.read();
        System.out.println(i);

        System.out.println("First Input");
        //1 Class Scanner
        Scanner scanner = new Scanner(System.in);
        //2 Msg
       System.out.println("Enter your age" );
       //3 Declaration
        //.next what you are expecting
       int age = scanner.nextInt();
       //4 printing
        System.out.println("your age is = " + age);

        System.out.println("Second Input");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String myName = scanner1.nextLine();
        System.out.println("Your name is  = " +myName);

        System.out.println("********************************Math operation**************************");

        int x , y ;
         x = 70;
         y = 30;
         //Even though 70/30 gives 2.333 the result will be integer
        System.out.println("Final value = " +x/y);
        //typeCsting
        System.out.println("Final value  = " +(float)x/y);


        System.out.println("********************************Incrementation***************************");
        System.out.println("************post incrementation X++ ***********");
        //print your value then increment
        int b = 10;
        System.out.println("POST INCRIMENT " + b++);
        System.out.println("The value of b did not change even though we incremented it!");
        System.out.println("POST INCRIMENT " + b);
        System.out.println("The value of b changes in the next operation after the performance of ++ :)");

        System.out.println("************Pre incrementation X++ ***********");

        //increment your value then gives you the result
        int a = 20;
        System.out.println("PRE INCRIMENT " + ++a);
        System.out.println("The value of a changed");








    }
}
