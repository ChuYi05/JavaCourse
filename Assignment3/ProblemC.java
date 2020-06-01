package Assignment3;
//提交OJ的时候如果没有删除package，虽然能够提交并且编译成功，但是会出现runtime error
//用交换法来求最小值的时候，会让除了第一个最小值之外的相同值的最小值之间的初始顺序被打破

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ProblemC {
    public static ArrayList<Date> sortDate(ArrayList<Date> dateSeries, ArrayList<Integer> timeSeries) {
        Date[] newDateSeries=new Date[dateSeries.size()];
        int[] newTimeSeries=new int[timeSeries.size()];//先创建数列
        int k=0;
        for (int i = 0; i < dateSeries.size(); i++) {
            newDateSeries[k]=dateSeries.get(i);
            for (int j = i + 1; j < dateSeries.size(); j++) {
                if (dateSeries.get(j).compareTo(newDateSeries[k]) < 0) {
                    newDateSeries[k] = dateSeries.get(j);
                }
            }
            newTimeSeries[k]=timeSeries.get(dateSeries.indexOf(newDateSeries[k]));
            timeSeries.remove(dateSeries.indexOf(newDateSeries[k]));
            dateSeries.remove(dateSeries.indexOf(newDateSeries[k]));//如果是先删除再赋值给newTimeSeries就会数组越界
            i--;
            k++;
        }
        ArrayList<Date> newDateArraylist=new ArrayList<>();//在将新的数列写入新的Arraylist
        for(int i=0;i<newDateSeries.length;i++){
            newDateArraylist.add(newDateSeries[i]);
            timeSeries.add(newTimeSeries[i]);
        }
        return newDateArraylist;
    }

    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n==0){
            System.out.println(0);
        }else {
            ArrayList<Date> dateSeries = new ArrayList<>();
            ArrayList<Integer> timeSeries = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            for (int i = 0; i < n; i++) {
                dateSeries.add(sdf.parse(input.next()));
                timeSeries.add(input.nextInt());
            }

            dateSeries = sortDate(dateSeries, timeSeries);//虽然只返回了排序后的dateSeries，但是timeSeries已经过方法的代码被修改过了

            int things = 0;

            for (int i = 0; i < dateSeries.size(); i++) {
                Calendar cd1 = Calendar.getInstance();
                cd1.setTime(dateSeries.get(i));
                cd1.add(Calendar.DATE, timeSeries.get(i));
                dateSeries.set(i, cd1.getTime());
                for (int j = i + 1; j < dateSeries.size(); j++) {
                    if (dateSeries.get(i).compareTo(dateSeries.get(j)) >= 0) {
                        dateSeries.remove(j);
                        timeSeries.remove(j);
                        j--;
                    }
                }
                things++;
            }

            System.out.println(things);
        }
    }
}
