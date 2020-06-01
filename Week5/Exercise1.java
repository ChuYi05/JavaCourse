package Week5;
import java.util.Scanner;

public class Exercise1 {
    static int Min(int a, int b){
        int min;
        if(a>b){
            min=b;
        }
        else {
            min=a;
        }
        return min;
    }
    static Double Min(Double a, Double b){
        Double min;
        if(a>b){
            min=b;
        }
        else {
            min=a;
        }
        return min;
    }
    static Double Min(Double a, Double b,Double c){
        Double min;
        Double p=a;
        if(a<b){
            if(p<c){
                min=p;
            }
            else {min=c;}
        }
        else {
            if(b<c){
                min=b;
            }
            else {
                min=c;
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two integer values: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.printf("The minimum of %d and %d is %d\n",a,b,Min(a,b));
        System.out.println("Enter two double values: ");
        Double aa=input.nextDouble();
        Double bb=input.nextDouble();
        System.out.printf("The minimum of %.1f and %.1f is %.1f\n",aa,bb,Min(aa,bb));
        System.out.println("Enter three double values: ");
        Double aaa=input.nextDouble();
        Double bbb=input.nextDouble();
        Double ccc=input.nextDouble();
        System.out.printf("The minimum of %.1f, %.1f and %.1f is %.1f",aaa,bbb,ccc,Min(aaa,bbb,ccc));
    }
}
