package Week8;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Enter the first city: ");
        Scanner input=new Scanner(System.in);
        String[] cities=new String[3];
        cities[0]=input.nextLine();
        System.out.print("Enter the second city: ");
        cities[1]=input.nextLine();
        System.out.print("Enter the third city: ");
        cities[2]=input.nextLine();
        for(int i=0;i<2;i++) {
            if (cities[i].compareTo(cities[i + 1]) > 0) {
                String a;
                a = cities[i];
                cities[i] = cities[i+1];
                cities[i+1]=a;
            }
        }
        for(int i=0;i<2;i++){
            for(int j = 0; j<cities[i].split("").length-1; j++){
                if(cities[i].split("")[j].compareTo(cities[i+1].split("")[j])<0){
                    String a;
                    a=cities[i];
                    cities[i]=cities[i+1];
                    cities[i+1]=a;
                }
        }
        }
        System.out.print("The three cities in alphabetical order are ");
        for(int i=0;i<3;i++){
            System.out.print(cities[i]+" ");
        }
    }

}
