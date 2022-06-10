package oop;

import java.util.Arrays;

public class ClassOne {

    public static void main(String[] args) {

        //instance
        Student s1 = new Student();
        //set
        s1.setId(1);
        s1.setName("Habiba");
        s1.setAge(20);
        //get
        //System.out.println("First instance = " + s1.getName()+" "+s1.getAge());

        System.out.println("Volume using defaul initialisation of constructor");
        Cube c1 = new Cube();
        int v1 = c1.getCubeVolume();
        System.out.println(v1);

        System.out.println("Volume using defaul initialisation of constructor");
        Cube c2 = new Cube(10,8,5);
        int v2 = c2.getCubeVolume();
        System.out.println(v2);


    }
}
