package Week2;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        float width,height,area,perimeter;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the width of a rectangular");
        width=input.nextFloat();
        System.out.println("Enter the height of a rectangular");
        height=input.nextFloat();
        perimeter=(width+height)*2;
        area=width*height;
        System.out.printf("The area is %f.\nThe perimeter is %f.",area,perimeter);
    }
}
