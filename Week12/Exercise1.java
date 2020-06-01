package Week12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    public static ArrayList<ClassRoom> readFromFile(String fileName) throws FileNotFoundException {
        ArrayList<ClassRoom> clsrms=new ArrayList<ClassRoom>();
        File file1=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\week12",fileName);
        Scanner read=new Scanner(file1);
        read.nextLine();
        int number=read.nextInt();
        read.nextLine();
        for(int i=0;i<number;i++){
            clsrms.add(new ClassRoom());
            read.nextLine();//忽略第一行介绍的内容
            clsrms.get(i).id=read.nextInt();
            clsrms.get(i).seatsNumber=read.nextInt();//在从text文件中用nextInt的时候，数字之间必须用回车或者空格断开（不能用,断开），否则Scanner.mismatch
            read.nextLine();
            read.nextLine();
            String[] arrangementRow=new String[5];
            for(int j=0;j<5;j++) {
                arrangementRow[j]=read.nextLine();
            }//读取带(1_1), 的arrangement
            String[] arrangementRow2=new String[5];
            for(int j=0;j<5;j++){
                Pattern pTemp=Pattern.compile("\\(.*?\\,");
                Matcher mTemp=pTemp.matcher(arrangementRow[j]);
                arrangementRow2[j]=mTemp.replaceAll("");
            }//删除掉(1_1),
            for(int j=0;j<5;j++){
                for(int k=0;k<7;k++){
                    clsrms.get(i).TheArragementOfTheClassRoom[j][k]=Integer.parseInt(arrangementRow2[j].split(",")[k]);
                }
            }//将2,3,2,1,0,3,0写入ClassRoom类的Arrangement中
        }
        return clsrms;
    }

    public static void printRoom(ArrayList<ClassRoom> clsrms){
        for(int i=0;i<clsrms.size();i++){
            clsrms.get(i).printRoom();
        }
    }

    public static ArrayList<ClassRoom> okRooms(ArrayList<ClassRoom> clsrms,int day,int time,int seats){
        ArrayList<ClassRoom> okRooms=new ArrayList<>();
        for(int i=0;i<clsrms.size();i++){
            if(clsrms.get(i).isValidforExam(day,time,seats)==true ){
                okRooms.add(clsrms.get(i));
            }
        }
        return okRooms;
    }

    public static void writeToFile(String fileName,ArrayList<ClassRoom> okRooms) throws FileNotFoundException {
        PrintStream ps=new PrintStream(new FileOutputStream("availableclassroom.txt"));
        System.setOut(ps);
        for(int i=0;i<okRooms.size();i++){
            System.out.println(i);
            okRooms.get(i).printRoom2();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input=new Scanner(System.in);

        System.out.println("Please input the file name you want too read");
        String fileName=input.nextLine();
        ArrayList<ClassRoom> clsrms=readFromFile(fileName);

        System.out.println("There are "+clsrms.size()+" in "+fileName);
        printRoom(clsrms);

        System.out.println("Please input the info of a classroom which you want to appoint(day time seats): ");
        int day=input.nextInt();
        int time=input.nextInt();
        int seats=input.nextInt();
        ArrayList<ClassRoom> okRooms=okRooms(clsrms,day,time,seats);
        System.out.println("There are "+okRooms.size()+" rooms valid for book");
        printRoom(okRooms);

        writeToFile("avaliableclassroom.txt",okRooms);

        input.close();
    }
}
