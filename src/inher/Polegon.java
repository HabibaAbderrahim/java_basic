package inher;

public class Polegon {

    //Those variables will be subclassed to other classes that inhert the main Class so they ca't be private so we use protected
    protected int height ;
    protected int weight ;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



}
