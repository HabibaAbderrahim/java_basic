import java.util.Arrays;

public class ClassString {
    public static void main(String[] args) {
        String myString = "Beautiful Day" ;

        System.out.println("some useful string functions");
        System.out.println("Upper : "+myString.toUpperCase());
        System.out.println("Lower : "+myString.toLowerCase());
        System.out.println("Replace character : "+myString.replace("a","o"));
        System.out.println("Replace String : "+myString.replaceFirst("Day","Girl"));
        System.out.println("Specific index : "+myString.indexOf("i"));




    }
}
