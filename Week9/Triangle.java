package Week9;

public class Triangle{
    private int a,b,c;
    private int perimeter;
    private double area;
    private boolean valid;

    public Triangle(){
        a=3;
        b=4;
        c=5;
        valid=true;
    }

    public Triangle(int x, int y, int z){
        a=x;
        b=y;
        c=z;
    };

    public int getA(){
        return a;
    };
    public int getB(){
        return b;
    };
    public int getC(){
        return c;
    };
    public void setA(int x){
        a=x;
    };
    public void setB(int y){
        b=y;
    };
    public void setC(int z){
        c=z;
    };
    public int getPerimeter(){
        return a+b+c;
    };
    public double getArea(){
        double p=(double)(a+b+c)/2;
        double a1=(double)a;
        double b1=(double)b;
        double c1=(double)c;
        return Math.sqrt(p*(p-a1)*(p-b1)*(p-c1));
    };
    public boolean isValid(){
        if(a+b>c&&a+c>b&&b+c>a){
            return true;
        }else return false;
    };
}