package Others;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BorrowBook {
    static int differentDaysBySecond(Date date1, Date date2){
        int days=(int)((date2.getTime()-date1.getTime())/(1000*3600*24));
        return days;
    }
    public static void main(String[] args) throws ParseException {
        String startingDate,ReturningDate;
        Scanner input=new Scanner(System.in);
        startingDate=input.next();
        ReturningDate=input.next();
        input.close();
        SimpleDateFormat format1=new SimpleDateFormat("yyyyMMdd");
        try {
            Date date1 = format1.parse(startingDate);
            Date date2 = format1.parse(ReturningDate);
            float days = differentDaysBySecond(date1, date2);
            if (days <= 30) {
                System.out.println("The return is successful!");
            } else {
                if (days <= 60) {
                    System.out.printf("You are late, please pay %.1f yuan!", ((days - 30) * 0.5));
                } else {
                    if (days <= 210) {
                        System.out.printf("You are late, please pay %.1f yuan!", ((days - 60) * 0.7) + 15);
                    } else {
                        System.out.println("You are late, please pay 250 yuan!");
                    }
                }
            }
        }catch(ParseException e){
        }
    }
}
