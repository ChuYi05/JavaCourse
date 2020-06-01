package Week3;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        double weight,height;
        double BMI;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter weight in KGs: ");
        weight=input.nextDouble();
        System.out.println("Enter height in meters: ");
        height=input.nextDouble();
        BMI=weight/Math.pow(height,2);
        if(BMI<18.5){
            System.out.printf("BMI is %f Underweight.",BMI);
        }
        else{
            if(BMI<=25.0){
                System.out.printf("BMI is %f Normal.",BMI);
            }
            else{
                if(BMI<=30.0){
                    System.out.printf("BMI is %f Overweight.",BMI);
                }
                else {
                    System.out.printf("BMI is %f Obese.",BMI);
                }
            }
        }



    }

}
