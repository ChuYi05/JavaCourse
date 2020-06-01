package Week12;


public class Circle extends GeometricObject{
    double radius;

    public Circle(){};

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);//对于父类中的private，必须要定义get和set方法
    }

    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public static String equals(Circle cir1, Circle cir2){
        if(cir1.getRadius()==cir2.getRadius()){
            return "";
        }else return " not";
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(ComparableCircle comCircle) {
        if (getArea() > comCircle.getArea()) {
            return 1;
        } else {
            if (getArea() < comCircle.getArea()) {
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
}
