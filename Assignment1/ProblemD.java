package Assignment1;
import java.util.ArrayList;
import java.util.Scanner;
//知识：可变长数组arraylist的运用，以及切割字符串。
//心得：在切割字符串之后，要注意保证同一列的数据之间的序号要时刻保持对应

public class ProblemD {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        String firstLine;
        for(firstLine=input.nextLine();!(firstLine.equals("0"));firstLine=input.nextLine()){
            list.add(firstLine);
        }
        int value[]=new int[list.size()];
        int urgency[]=new int[list.size()];
        int preference[]=new int[list.size()];
        try {
            for (int i = 0; i < list.size(); i++) {
                String[] num = list.get(i).split(" ");
                value[i] = Integer.parseInt(num[0]);
                urgency[i] = Integer.parseInt(num[1]);
                preference[i] = Integer.parseInt(num[2]);
            }
        }catch (NumberFormatException e){
        }
        int[] sequence=new int[list.size()];
        for(int i=0;i<list.size();i++){
            sequence[i]=i+1;
        }
        int temp;
        for(int i=0;i<list.size();i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (urgency[i] > urgency[j]) {
                    temp = urgency[i];
                    urgency[i] = urgency[j];
                    urgency[j] = temp;
                    temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                    temp = preference[i];
                    preference[i] = preference[j];
                    preference[j] = temp;
                    temp = sequence[i];
                    sequence[i] = sequence[j];
                    sequence[j] = temp;
                }
            }
        }
        for(int i=0;i<list.size();i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (urgency[i] == urgency[j]) {
                    if (preference[i] < preference[j]) {
                        temp = urgency[i];
                        urgency[i] = urgency[j];
                        urgency[j] = temp;
                        temp = value[i];
                        value[i] = value[j];
                        value[j] = temp;
                        temp = preference[i];
                        preference[i] = preference[j];
                        preference[j] = temp;
                        temp = sequence[i];
                        sequence[i] = sequence[j];
                        sequence[j] = temp;
                    }
                }
            }
        }
        float sum=0;
        for(int i=0;i<list.size();i++){
            sum+=value[i];
        }
        float averageValue=sum/list.size();
        for(int i=0;i<list.size();i++){
            if(value[i]>averageValue){
                System.out.printf("%d ",sequence[i]);
            }
        }
    }
}
