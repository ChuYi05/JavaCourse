package Week1_2020_02_10;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name=input.next();
        System.out.printf("Welcome to Java, %s!",name);
    }
}
