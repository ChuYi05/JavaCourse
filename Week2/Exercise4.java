package Week2;
import java.util.Scanner;

public class Exercise4 {
    public static  void  main(String[] args){
        int second,minute,hour,t;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        second=input.nextInt();
        t=second;
        if(second>=60){
            minute=second/60;
            second=second-minute*60;
            if(minute>=60){
                hour=minute/60;
                minute=minute-hour*60;
                System.out.printf("The equivalent time is %dhours, %dminutes and %dseconds.",hour,minute,second);
            }
            else {
                System.out.printf("The equivalent time is %dminutes and %dseconds.",minute,second);
            }
        }
        else {
            System.out.printf("The equivalent time is %d seconds.",second);
        }

    }
}
