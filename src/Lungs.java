public class Lungs extends Organ {

    //overrriding
    public void VitalFunction(){
        System.out.println ("I'm responsible of breathing");
    }

    //overloading : Generally same classs
    public String VitalFunction(String b){
        b = "I'm responsible of breathing";
        return b;
    }
}
