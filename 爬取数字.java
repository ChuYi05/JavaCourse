import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 爬取数字 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src/19年化学系硕士初试平均分.txt");
        Scanner input=new Scanner(file);
        File file2=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src/19年化学系硕士初试平均分2.txt");
        file2.createNewFile();
        BufferedWriter out=new BufferedWriter(new FileWriter(file2));
        while(input.hasNext()) {
            Pattern p=Pattern.compile("\\d{3}");
            String a=input.next();
            Matcher m=p.matcher(a);
            if(m.matches()){
                out.write(a);
                out.write("\n");
            }
        }
        out.close();
        System.out.println("Done!");
    }
}