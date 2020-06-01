package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemD {
    public static String parseSensitiveWords(String sensitiveWords){//虽然Pattern.compile里面不能String相加，但是可以写一个方法来实现相加
        String parseRegex="(?i)(";
        char[] sensitiveCharacters=sensitiveWords.toCharArray();
        for(int i=0;i<sensitiveCharacters.length;i++){
            parseRegex+=sensitiveCharacters[i];
            parseRegex+="+";
        }
        parseRegex+=")";
        return parseRegex;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String sensitive=input.nextLine();
        String text="";
        String a;
        for(int i=0;;i++){
            a=input.nextLine();
            if(a.charAt(0)=='0') {//"0“在这里不能被看作String吗？
                break;
            }else text+=a;
        }

        String[] Characters=text.split("");

        String regex="(\".*?\")|(((say that )|(says that )|(said that ))(.)*?(\\.|\\!))";//如果要避免.*和终止的符号重复，用一个?就可以了
        Pattern r=Pattern.compile(regex);
        Matcher m=r.matcher(text);

        ArrayList<Integer> Start=new ArrayList<>();
        ArrayList<Integer> End=new ArrayList<>();
        while ((m.find())){
            Start.add(m.start());
            End.add(m.end());
        }//记录匹配到内容的位置
        ArrayList<String> selectedSentences=new ArrayList<>();
        for(int i=0;i<Start.size();i++){
            String temp="";
            for(int j=Start.get(i);j<End.get(i)-1;j++){
                temp+=Characters[j];
            }
            selectedSentences.add(temp);
        }//将关键的句子储存起来

        String delete="(\")|(say that )|(says that )|(said that )";
        Pattern p2=Pattern.compile(delete);
        for(int i=0;i<selectedSentences.size();i++) {
            Matcher m2 = p2.matcher(selectedSentences.get(i));
            while(m2.find()){
                selectedSentences.set(i,m2.replaceAll(""));
            }
        }//完成了提取（删掉says that和“”）

        for(int i=0;i<selectedSentences.size();i++) {
            System.out.println(selectedSentences.get(i));
        }

        if(sensitive==""){//??这里有个小问题，为什么debug里面显示sensitive是""，但是跑的时候不进if
            for(int i=0;i<selectedSentences.size();i++) {
                System.out.println(selectedSentences.get(i));
            }
        }else {
            String[] processedSentences = new String[selectedSentences.size()];
            String[] sensitiveWords = sensitive.split(" ");
            for (int j = 0; j < selectedSentences.size(); j++) {
                processedSentences[j] = selectedSentences.get(j);
                for (int t = 0; t < sensitiveWords.length; t++) {
                    Pattern pTemp = Pattern.compile("" + parseSensitiveWords(sensitiveWords[t]));//这里必须要加上“”+
                    Matcher mTemp = pTemp.matcher(processedSentences[j]);
                    processedSentences[j] = mTemp.replaceAll("***");
                }//每段话审核t次
            }
            for (int i = 0; i < processedSentences.length; i++) {
                System.out.println(processedSentences[i]);
            }//打印
        }
    }
}
