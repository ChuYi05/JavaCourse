package Week12;

public class Exercise2 {
    public static double sumArea(GeometricObject[] a){
        double sumArea=0;
        for(int i=0;i<a.length;i++) {
            sumArea += a[i].getArea();
        }
        return sumArea;
    }

    public static void main(String[] args) {
        System.out.println("You have created four objects, two circles and two rectangles.");
        Rectangle rec1=new Rectangle(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        Rectangle rec2=new Rectangle(Double.parseDouble(args[2]),Double.parseDouble(args[3]));
        Circle cir1=new Circle(Double.parseDouble(args[4]));
        Circle cir2=new Circle(Double.parseDouble(args[5]));
        System.out.printf("The Circles' radius are: %.1f, %.1f",cir1.radius,cir2.radius);
        System.out.println();
        System.out.printf("The rectangles' width are: %.1f, %.1f and height are: %.1f, %.1f",rec1.getWidth(),rec2.getWidth(),rec1.getHeight(),rec2.getHeight());
        System.out.println();
        System.out.printf("Two circles are%s equal",Circle.equals(cir1,cir2));
        System.out.println();
        System.out.printf("Two rectangles are%s equal",Rectangle.equals(rec1,rec2));
        System.out.println();

        ComparableCircle comCir1=new ComparableCircle(cir1.radius);
        ComparableCircle comCir2=new ComparableCircle(cir2.radius);
        ComparableRectangle comRec1=new ComparableRectangle(rec1.getWidth(),rec1.getHeight());
        ComparableRectangle comRec2=new ComparableRectangle(rec2.getWidth(),rec2.getHeight());
        System.out.printf("The circle of radius %.1f is %s than the circle of radius %.1f",cir1.radius,ComparableCircle.parse(comCir1.compareTo(comCir2)),cir2.radius);
        System.out.println();
        System.out.printf("The rectangle of area %.2f is %s than the rectangle of area %.2f",rec1.getArea(),ComparableRectangle.parse(comRec1.compareTo(comRec2)),rec2.getArea());
        System.out.println();
        GeometricObject[] total=new GeometricObject[]{cir1,cir2,rec1,rec2};
        System.out.printf("The total areas of the four objects are: %.2f",sumArea(total));
    }
}
