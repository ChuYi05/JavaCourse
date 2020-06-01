package Week2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        String name,highestGrade;
        int age;
        float weight;
        Scanner in=new Scanner(System.in);
        System.out.println("Your name is ");
        name=in.next();
        System.out.println("Your age is ");
        age=in.nextInt();
        System.out.println("Your weight is ");
        weight=in.nextFloat();
        System.out.println("Your highestGrade is ");
        highestGrade=in.next();
        System.out.printf("You are %s.\nYou are %d years old.\nYour weight is %f KG.\nThe highest grade your have got is %s.",name,age,weight,highestGrade);
    }
}
