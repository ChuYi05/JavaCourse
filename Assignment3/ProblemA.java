package Assignment3;
//注意二维数组动态的创建，有时候不一定要用Arraylist

import java.util.Scanner;

public class ProblemA {
    public static char shift(char ch,int times){
        if((ch+times-97)%26>=0) {
            ch = (char) ((ch + times - 97) % 26 + 97);
        }else ch = (char) ((ch + times - 97) % 26 + 123);
        return ch;
    }//注意这里按照字母表的顺序转换字符的方法

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String[] sArray=new String[n];
        char[][] charArray=new char[n][];
        int[][] shiftArray=new int[n][];
        char[][] result=new char[n][];
        for(int i=0;i<n;i++){
            sArray[i]=input.next();
            charArray[i]=sArray[i].toCharArray();
            shiftArray[i]=new int[charArray[i].length];//二维数组动态创建
            for(int j=0;j<charArray[i].length;j++){
                shiftArray[i][j]=input.nextInt();
            }
            result[i]=charArray[i];
            for(int j=0;j<charArray[i].length;j++){//确定每一次变换的个数
                for(int k=0;k<=j;k++) {
                    result[i][k] = shift(result[i][k], shiftArray[i][j]);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
