package Week5;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        int month=input.nextInt();
        switch (year%400){
            case 0:{
                switch (month){
                    case 1:System.out.printf("January of %d has 31 days",year);break;
                    case 2:System.out.printf("February of %d has 29 days",year);break;
                    case 3:System.out.printf("March of %d has 31 days",year);break;
                    case 4:System.out.printf("April of %d has 30 days",year);break;
                    case 5:System.out.printf("May of %d has 31 days",year);break;
                    case 6:System.out.printf("June of %d has 30 days",year);break;
                    case 7:System.out.printf("July of %d has 31 days",year);break;
                    case 8:System.out.printf("August of %d has 31 days",year);break;
                    case 9:System.out.printf("September of %d has 30 days",year);break;
                    case 10:System.out.printf("October of %d has 31 days",year);break;
                    case 11:System.out.printf("November of %d has 30 days",year);break;
                    case 12:System.out.printf("December of %d has 31 days",year);break;
                }break;
            }
            case 100: {
                switch (month){
                case 1:System.out.printf("January of %d has 31 days",year);break;
                case 2:System.out.printf("February of %d has 28 days",year);break;
                case 3:System.out.printf("March of %d has 31 days",year);break;
                case 4:System.out.printf("April of %d has 30 days",year);break;
                case 5:System.out.printf("May of %d has 31 days",year);break;
                case 6:System.out.printf("June of %d has 30 days",year);break;
                case 7:System.out.printf("July of %d has 31 days",year);break;
                case 8:System.out.printf("August of %d has 31 days",year);break;
                case 9:System.out.printf("September of %d has 30 days",year);break;
                case 10:System.out.printf("October of %d has 31 days",year);break;
                case 11:System.out.printf("November of %d has 30 days",year);break;
                case 12:System.out.printf("December of %d has 31 days",year);break;
                }break;
            }
            case 200:{
                switch (month){
                    case 1:System.out.printf("January of %d has 31 days",year);break;
                    case 2:System.out.printf("February of %d has 28 days",year);break;
                    case 3:System.out.printf("March of %d has 31 days",year);break;
                    case 4:System.out.printf("April of %d has 30 days",year);break;
                    case 5:System.out.printf("May of %d has 31 days",year);break;
                    case 6:System.out.printf("June of %d has 30 days",year);break;
                    case 7:System.out.printf("July of %d has 31 days",year);break;
                    case 8:System.out.printf("August of %d has 31 days",year);break;
                    case 9:System.out.printf("September of %d has 30 days",year);break;
                    case 10:System.out.printf("October of %d has 31 days",year);break;
                    case 11:System.out.printf("November of %d has 30 days",year);break;
                    case 12:System.out.printf("December of %d has 31 days",year);break;
                }break;
            }
            case 300:{
                switch (month){
                    case 1:System.out.printf("January of %d has 31 days",year);break;
                    case 2:System.out.printf("February of %d has 28 days",year);break;
                    case 3:System.out.printf("March of %d has 31 days",year);break;
                    case 4:System.out.printf("April of %d has 30 days",year);break;
                    case 5:System.out.printf("May of %d has 31 days",year);break;
                    case 6:System.out.printf("June of %d has 30 days",year);break;
                    case 7:System.out.printf("July of %d has 31 days",year);break;
                    case 8:System.out.printf("August of %d has 31 days",year);break;
                    case 9:System.out.printf("September of %d has 30 days",year);break;
                    case 10:System.out.printf("October of %d has 31 days",year);break;
                    case 11:System.out.printf("November of %d has 30 days",year);break;
                    case 12:System.out.printf("December of %d has 31 days",year);break;
                }break;
            }
            default:{
                switch (year%4){
                    case 0:{
                        switch (month){
                            case 1:System.out.printf("January of %d has 31 days",year);break;
                            case 2:System.out.printf("February of %d has 29 days",year);break;
                            case 3:System.out.printf("March of %d has 31 days",year);break;
                            case 4:System.out.printf("April of %d has 30 days",year);break;
                            case 5:System.out.printf("May of %d has 31 days",year);break;
                            case 6:System.out.printf("June of %d has 30 days",year);break;
                            case 7:System.out.printf("July of %d has 31 days",year);break;
                            case 8:System.out.printf("August of %d has 31 days",year);break;
                            case 9:System.out.printf("September of %d has 30 days",year);break;
                            case 10:System.out.printf("October of %d has 31 days",year);break;
                            case 11:System.out.printf("November of %d has 30 days",year);break;
                            case 12:System.out.printf("December of %d has 31 days",year);break;
                        }break;
                    }
                    default:{
                        switch (month){
                            case 1:System.out.printf("January of %d has 31 days",year);break;
                            case 2:System.out.printf("February of %d has 28 days",year);break;
                            case 3:System.out.printf("March of %d has 31 days",year);break;
                            case 4:System.out.printf("April of %d has 30 days",year);break;
                            case 5:System.out.printf("May of %d has 31 days",year);break;
                            case 6:System.out.printf("June of %d has 30 days",year);break;
                            case 7:System.out.printf("July of %d has 31 days",year);break;
                            case 8:System.out.printf("August of %d has 31 days",year);break;
                            case 9:System.out.printf("September of %d has 30 days",year);break;
                            case 10:System.out.printf("October of %d has 31 days",year);break;
                            case 11:System.out.printf("November of %d has 30 days",year);break;
                            case 12:System.out.printf("December of %d has 31 days",year);break;
                        }break;
                    }

            }
            }break;
        }
    }
}
