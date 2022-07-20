package java.notions;

public class ClassoOverload {

    //method with the same name and different params

    public static int add (int a , int b){
        return a+b;
    }

   /* XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
   No same parameters even though the return is different
    public static double add(int a , int b){
        return a+b;
    }*/

    public static double add(double a , double b){
        return a+b;
    }
}
