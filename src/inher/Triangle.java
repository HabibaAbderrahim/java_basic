package inher;

public class Triangle extends Polegon {

    public int getArea(){

        //Direct use since it inheret properties of the main Class
        return height*weight;
    }

    public static class Test {

        public static void main(String[] args) {
            Triangle t = new Triangle();
            t.setHeight(10);
            t.setWeight(10);
            int area = t.getArea();

            System.out.println("Triangle Area that inhert the height and weight is= " +area);
        }



    }
}
