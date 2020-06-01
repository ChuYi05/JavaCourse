package Week2;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number1,number2,sum;
        System.out.println("Please enter the first number");
        number1=in.nextInt();
        System.out.println("Please enter the second number");
        number2=in.nextInt();
        sum=number1+number2;
        System.out.printf("Sum is %d",sum);
    }
}
