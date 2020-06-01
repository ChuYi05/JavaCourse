package Week3;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        int n,i=2;
        double pi=4,a=3,p=-1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the precise number n: ");
        n=input.nextInt();
        while(i<=n){
            pi=(pi+(4/a)*(p));
            a+=2;
            p=-p;
            i++;
        }
        System.out.printf("The approximate value of pi is %f",pi);
    }
}
