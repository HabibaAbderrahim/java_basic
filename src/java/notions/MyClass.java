import access.modifier.test.Student;

import java.notions.ClassSta;
import java.notions.StudentStat;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("Call Static Method Ref ClassName" );
        String M1= ClassSta.printMsg("I'm related Directly to the class itself");
        System.out.println("M1 = " + M1);
         //as you can see .staticMethod only

        System.out.println("Call Non Static Method" );
        ClassSta o1 = new ClassSta();
        String M2=o1.printMsgE("I'm directly affected to particular Object o1");
        System.out.println("M2 = " +M2);

        //first isntance
        StudentStat s1 = new StudentStat();
        s1.setName("Habiba");
        //get name non static using instance
        String name1= s1.getName();
        System.out.println("name s1 = " + name1);
        //set age  static variable using class name
        StudentStat.setAge(20);
        System.out.println("Static Age = " + s1.getAge());//static age

        StudentStat s2 = new StudentStat();
        s2.setName("hedi");
        System.out.println("S2 name"+s2.getName() +"S2 age " +s2.getAge());//static age
        System.out.println("Total number of students static variable = " +StudentStat.getStudentNumb());//static age


        Student Sa = new Student();
        //variable adresse with no modifer can be acceble outside it package
        //Sa.adresse ;
        // public variable name accessable outside the class and package
        String s = Sa.name ;
        //not acceable outside the package and outside the class
        //int age = Sa.age ;
    }
}
