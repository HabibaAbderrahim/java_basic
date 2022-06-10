package oop;

public class Cube {

    int l ;
    int b ;
    int h ;

    /* constructor
    first methods that's executed
    use : intialiase values in a class
    same as class name
    never returns
     constructor*/

    // Default constructor
    Cube(){
        l = 10 ;
        b = 15 ;
        h = 30 ;
    }

    //Overloading constructor
    //same method name with different parameters
    Cube(int lenght , int bb , int height){
        l = lenght ;
        b = bb ;
        h = height ;

    }

    public int getCubeVolume(){
        return l*b*h ;

    }
}
