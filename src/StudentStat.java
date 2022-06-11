package java.notions;

public class StudentStat {

    String name ;
    int age ;
    //static variable for all
    static int studentNumb = 0 ;

    StudentStat(){
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

    public void setAge(int age) {
        this.age = age;
    }



}
