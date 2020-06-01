package Week9;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(Math.E));
        Triangle aTriangle=new Triangle();
        System.out.println("Create a default Triangle, its edges are: "+aTriangle.getA()+" "+aTriangle.getB()+" "+aTriangle.getC());
        System.out.println("Its perimeter is: "+aTriangle.getPerimeter()+" and its area is: "+aTriangle.getArea());

        Scanner input=new Scanner(System.in);
        System.out.println("Create a new Triangle, please input three edges:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        Triangle newTriangle=new Triangle(a,b,c);
        if(newTriangle.isValid()){
            System.out.println("A new Triangle is created, its edges are: "+newTriangle.getA()+" "+newTriangle.getB()+" "+newTriangle.getC());
            System.out.println("Its perimeter is: "+newTriangle.getPerimeter()+" and its area is: "+newTriangle.getArea());
        }else System.out.println("The new Triangle is not valid");

        System.out.println("Modify an edge of the new Triangle, please input its value:");
        int x=input.nextInt();
        newTriangle.setA(x);

        if(newTriangle.isValid()){
            System.out.println("A new Triangle is created, its edges are "+newTriangle.getA()+" "+newTriangle.getB()+" "+newTriangle.getC());
            System.out.println("Its perimeter is: "+newTriangle.getPerimeter()+" and its area is: "+newTriangle.getArea());
        }else System.out.println("The new Triangle is not valid");

    }
}
