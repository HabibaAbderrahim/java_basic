public class Test {

    public static  int fact(int n){
       // fact 0 = 1
        if(n==0){
            return 1 ;}
        else return n*fact(n-1);
    }
    public static int facts(int n){

        int f = 1;
        for (int i = n ; i>1 ; i--){
            f= f*i ;
        }
        return f;
    }


    public static void main(String[] args) {
        int n = fact(5);
        int ns = facts(0);
        System.out.println("5!="+ns);

        System.out.println("5!="+n);
        Organ organ  = new Organ();
        //upcasting
        System.out.println("Upcasting subclass Referring to base");
        Organ heart = new Heart();
        heart.VitalFunction();
        //upcasting
        Organ lungs = new Lungs();
        lungs.VitalFunction();
        //Try to inistantiate abstract class
        //BankAb b = new BankAb() ;
        //Try to instantiate a subclass of the abstract class
        BankAb b = new BankABC();


    }
}
