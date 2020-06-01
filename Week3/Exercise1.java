package Week3;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Double a,b,c,delta;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a, b and c: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        delta=Math.sqrt(b*2-4*a*c);
        if(delta>0){
            System.out.printf("The roots are %.2f and %.2f.",(-b+delta)/(2*a),(-b-delta)/(2*a));
        }
        if(delta==0){
            System.out.printf("The root is %.2f.",(-b)/(2*a));
        }
        if(delta<0){
            System.out.printf("The equation has no real roots.");
        }
    }
}
