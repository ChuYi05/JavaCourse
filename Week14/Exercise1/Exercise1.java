package Week14.Exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2.3);
        shapes[1] = new Square(4.8);
        shapes[2] = new Sphere(5.2);
        shapes[3] = new Cube(9.5);

        for (int i = 0; i < 4; i++) {
            if (shapes[i].getDimension() == 2) {
                System.out.println("Two dimensional shape: " + shapes[i].getShape() + ". Its " + shapes[i].getElementName() + " is " + shapes[i].getElement()+", area is: " + shapes[i].getArea() + ".");
            } else {
                System.out.println("Three dimensional shape: " + shapes[i].getShape() + ". Its " + shapes[i].getElementName() + " is " + shapes[i].getElement()+", area is: " + shapes[i].getArea() + ", volume is " + shapes[i].getVolume() + ".");
            }
        }
    }
}
