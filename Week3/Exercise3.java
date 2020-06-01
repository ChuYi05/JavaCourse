package Week3;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        int s;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score: ");
        s=input.nextInt();
        if(s<0||s>100){
            System.out.println("Invalid score!");
        }
        else{
            if(s>=60) {
                System.out.println("You passed the exam.");
                if (s <= 70) System.out.printf("Your score is %d, the GPA is 1.0.", s);
                else {
                    if (s >= 70) System.out.printf("Your score is %d, the GPA is 2.0.", s);
                    else {
                        if (s >= 80) System.out.printf("Your score is %d, the GPA is 3.0.", s);
                        else {
                            System.out.printf("Your score is %d, the GPA is 4.0.", s);
                        }
                    }
                }
            }
             else{
                 System.out.printf("Your score is %d, the GPA is 0.0.,s");
                }
            }
        }
    }

