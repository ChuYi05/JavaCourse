package Week3;
import java.util.Scanner;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args){
        int magicNum;
        int guessingNum;
        Random random=new Random();
        magicNum=random.nextInt(10);
        Scanner input=new Scanner(System.in);
        System.out.println("Please guess the number: ");
        guessingNum=input.nextInt();
        while(guessingNum!=magicNum){
            if(guessingNum>magicNum){
                System.out.println("Too big! Please try again.");
            }
            if(guessingNum<magicNum){
                System.out.println("Too small! Please try again.");
            }
            System.out.println("Please guess again: ");
            guessingNum=input.nextInt();
        }
        if(guessingNum==magicNum) {
            System.out.println("Congratulations!");
        }
    }

}
