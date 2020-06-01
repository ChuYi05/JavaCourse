package Week8;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence(words separated by blanks):");
        Scanner input=new Scanner(System.in);
        String sentence=input.nextLine();
        String[] wordsEnglish=sentence.split(" ");
        String[][] wordsLatin=new String[wordsEnglish.length][];
        for(int i=0;i<wordsEnglish.length;i++){
            int a=wordsEnglish[i].split("").length;
            wordsLatin[i]=new String[wordsEnglish[i].length()+1];
            for(int j=0;j<a-1;j++){
                wordsLatin[i][j]=wordsEnglish[i].split("")[j+1];
                wordsLatin[i][a-1]=wordsEnglish[i].split("")[0];
                wordsLatin[i][a]="ay";
            }
        }
        for(int i=0;i<wordsLatin.length;i++) {
            for (int j = 0; j < wordsLatin[i].length; j++) {
                System.out.print(wordsLatin[i][j]);
            }
            System.out.print(" ");
        }
    }
}
