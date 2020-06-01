package Week13;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        boolean determine=false;
        Scanner input=new Scanner(System.in);
        do{
            try {
                determine=false;
                System.out.print("Please input two integers: ");
                int a=input.nextInt();//如果输入不是int，则这一行的读取无效
                int b=input.nextInt();
                System.out.println(a + " + " + b + " = " + (a + b));
            } catch (InputMismatchException e) {
                String c= input.nextLine();//一定要消除之前用户输入的两个字符
                System.out.println("Try again.(Incorrect input: an integer is required)");
                e.printStackTrace();
                determine=true;
            }
        }while (determine);
    }
}
