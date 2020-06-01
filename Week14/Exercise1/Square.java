package Week14.Exercise1;

public class Square extends TwoDimensionalShape{
    double element;

    Square(double l){
        element=l;
    }

    public double getArea(){
        return element*element;
    }

    public String getShape(){
        return "Square";
    }

    public String getElementName(){
        return "length";
    }

    public double getElement(){
        return element;
    }
}
