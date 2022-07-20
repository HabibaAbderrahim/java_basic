package java.notions;

public class StudentStat {

    String name ;
    static int  age ;
    //static variable for all
    static int studentNumb = 0 ;

    public StudentStat(){
        //incriment the value for each initialisation of student
        studentNumb++ ;
    }

    //STATIC METHOD FOR ALL INSTANCE OF THE CLASS
    public static int getStudentNumb(){
        return  studentNumb ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public static void setAge(int age) {
        //not using this.age but class name
        StudentStat.age = age;
    }



}
