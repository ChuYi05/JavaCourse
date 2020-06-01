package Week14.Exercise1;

public class Cube extends ThreeDimensionalShape{
    double element;

    Cube(double l){
        element=l;
    }

    public double getArea(){
        return Math.pow(element,2)*6;
    }

    public double getVolume(){
        return Math.pow(element,3);
    }

    public String getShape(){
        return "Cube";
    }

    public String getElementName(){
        return "length";
    }

    public double getElement(){
        return element;
    }
}
