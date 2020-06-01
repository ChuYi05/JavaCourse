package Week10;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String original=input.nextLine();
        String[] split=original.split("[,.:;]");

        for(int i=0;i<split.length-1;i++){
            for(int j=i+1;j<split.length;j++) {
                if (split[j].length() < split[i].length()) {
                    String a = split[i];
                    split[i] = split[j];
                    split[j] = a;
                }
            }
        }//按照长度排序,注意将前后2个比较是不行的，要把每一个都和后面的所有数进行比较

        for(int i=0;i<split.length;i++){
            if(Character.isLetter(split[i].charAt(0))){//注意这里的正则表达式
                StringBuilder splitI=new StringBuilder(split[i]);
                String a=String.valueOf(split[i].charAt(0));
                String A=a.toUpperCase();
                splitI.replace(0,1,A);
                split[i]=splitI.toString();
            }
        }//将第一个字符大写
        //如果将split[i].charAt(0)先定义为char c，再对c进行修改，split[0].charAt(0)的值不会变,因为c只是一个引用
        //charAt是一个方法，是不可以对其进行运算的，只能赋值给其他或者直接打印

        for(int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }

    }
}
