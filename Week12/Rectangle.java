package Week12;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(double width,double height,String color,boolean filled){
        this.width=width;
        this.height=height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }

    public static String equals(Rectangle rec1,Rectangle rec2){
        if(rec1.getArea()==rec2.getArea()){
            return "";
        }else return " not";
    }
}

class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    public int compareTo(ComparableRectangle comRectangle) {
        if (getArea() > comRectangle.getArea()) {
            return 1;
        } else {
            if (getArea() < comRectangle.getArea()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static String parse(int a){
        String result="";
        if(a==0){
            return result="the same";
        }else {
            if(a==1){
                return result="larger";
            }else {
                if(a==-1){
                    return result="less";
                }
            }
        }
        return result;
    }

    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() + " Area: " + getArea();
    }
}
