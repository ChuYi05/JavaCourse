    package Week14.Exercise1;

    public class Circle extends TwoDimensionalShape{
        double element;

        Circle(double r){
            element=r;
        }

        public double getArea(){
            return Math.PI*Math.pow(element,2)/2;
        }

        public String getShape(){
            return "Circle";
        }

        public String getElementName(){
            return "radius";
        }

        public double getElement(){
            return element;
        }
    }
