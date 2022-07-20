package access.modifier.test;

public class Test {
    public static void main(String[] args) {
        //Acess private value in same package
        Student s = new Student();
        //publice:s.name ---> Accessable inside and outside
        //No modifier :s.adresse ---> Accable inside the same package outside NO
        //Private : s.age ---> NOT accable even inside the same package only inside the Class
    }
}
