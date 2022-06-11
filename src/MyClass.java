package java.notions;

import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("Call Static Method Ref ClassName" );
         //ClassSta.printMsg("I'm related Directly to the class itself");
         //as you can see .staticMethod only

        System.out.println("Call Non Static Method" );
        //ClassSta o1 = new ClassSta();
       // o1.printMsgE("I'm directly affected to particular Object o1");

        //first isntance
        StudentStat s1 = new StudentStat();
        s1.setName("Habiba");
        //get name non static using instance
        String name1= s1.getName();
        System.out.println("name s1 = " + name1);
        //set age  static variable using class name
        //StudentStat.setAge(20);
       // System.out.println("Static Age = " + s1.getAge());//static age

        StudentStat s2 = new StudentStat();
        s1.setName("hedi");
        System.out.println("S2 name"+s2.getName());//static age
        System.out.println("Total number of students static variable = " +StudentStat.getStudentNumb());//static age



    }
}
