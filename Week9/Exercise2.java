package Week9;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("There is a classroom");
        ClassRoom c1=new ClassRoom();
        c1.printClassRoom();
        System.out.println("Please input your day, time, nubmer:");
        System.out.printf("Day(1~7): ");
        int day=input.nextInt();
        System.out.printf("Time(1~5): ");
        int time=input.nextInt();
        System.out.printf("Number of students: ");
        int number=input.nextInt();
        c1.printValidForExam(day,time,number);
        input.close();
    }
}
