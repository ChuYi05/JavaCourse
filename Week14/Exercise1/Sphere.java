package Week14.Exercise1;

public class Sphere extends ThreeDimensionalShape{
    double element;

    Sphere(double r){
        element=r;
    }

    public double getArea(){
        return Math.pow(element,2)*4;
    }

    public double getVolume(){
        return Math.pow(element,3)*4/3;
    }

    public String getShape(){
        return "Sphere";
    }

    public String getElementName(){
        return "radius";
    }

    public double getElement(){
        return element;
    }
}
