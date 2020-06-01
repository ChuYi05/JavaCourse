package Week10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise2 {
    public static ArrayList<Character> sort(String s1){
        char[] s1LetterandBlank=s1.toCharArray();
        ArrayList<Character> s1Letter=new ArrayList<>();

        for(int i=0;i<s1LetterandBlank.length;i++){
            if(Character.isLetter(s1LetterandBlank[i])){
                s1Letter.add(s1LetterandBlank[i]);
            }
        }//删除空格和标点

        Collections.sort(s1Letter);//按字母顺序排序

        return s1Letter;
    }

    public static boolean areAnagram(String s1,String s2){
        boolean result=false;
        sort(s1);
        sort(s2);

        if(sort(s1).equals(sort(s2))){
            result=true;
        }

        return result;
    }

    public static String conversion(ArrayList<Character> Letter){
        char[] a=new char[Letter.size()];
        for(int i=0;i<Letter.size();i++){
            a[i]=Letter.get(i);
        }
        String s=String.valueOf(a);
        return  s;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String determinate;
        do {
            System.out.print("Please enter the first string: ");
            String s1 = input.nextLine();
            System.out.print("Please enter the second string: ");
            String s2 = input.nextLine();

            System.out.println("All letters in \"" + s1 + "\" are as follows \"" + conversion(sort(s1)) + "\"");
            System.out.println("All letters in \"" + s2 + "\" are as follows \"" +conversion(sort(s1)) + "\"");

            if (areAnagram(s1, s2)) {
                System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are anagrams!");
            } else {
                System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are NOT anagrams!");
            }

            System.out.println();
            System.out.print("Do you want to continue?(y or n)");
            determinate=input.nextLine();
        }while (determinate.equals("y"));

        System.out.println("Exit!");
    }
}
