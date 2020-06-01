package Week9;

import java.util.Random;

public class ClassRoom {
    private int id;
    private int seatsNumber;
    private int[][] arrangement;

    public ClassRoom(){
        id=201;
        seatsNumber=45;
        arrangement=new int[5][7];
        Random r=new Random();
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
                arrangement[i][j]=r.nextInt(5);
            }
        }
    }

    public ClassRoom(int id,int seatsNumber){
        this.id=id;
        this.seatsNumber=seatsNumber;
        arrangement=new int[5][7];
        Random r=new Random();
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
                arrangement[i][j]=r.nextInt(5);
            }
        }
    }

    public void printClassRoom(){
        for(int i=0;i<80;i++){
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("     Class Room #%d with Seats(%d)",id,seatsNumber);
        System.out.println();
        System.out.print("           ");
        for(int i=0;i<7;i++){
            System.out.print("Day"+(i+1)+"      ");
        }
        System.out.println();
        for(int i=0;i<4;i++){
            System.out.print((i+1)+"("+(2*i+1)+"_"+(2*i+2)+")"+"     ");
            for(int j=0;j<7;j++){
                System.out.print(arrangement[i][j]+"         ");
            }
            System.out.println();
        }
        System.out.print("5(9_10)    ");
        for(int j=0;j<7;j++){
            System.out.print(arrangement[4][j]+"         ");
        }
        System.out.println();
        for(int i=0;i<80;i++){
            System.out.print("=");
        }
        System.out.println();
    }

    public void printValidForExam(int day,int time,int number){
        if(arrangement[time-1][day-1]==0&&number<=seatsNumber){
            System.out.printf("Room #%d with seats(%d) on day_%d time_%d is Valid for EXAM",id,seatsNumber,day,time);
            System.out.println();
            System.out.println("The number of seats in room is OK");
            System.out.printf("The room at day_%d time_%d is OK",day,time);
        }else {
            System.out.printf("Room #%d with seats(%d) on day_%d time_%d is NOT Valid for EXAM",id,seatsNumber,day,time);
            System.out.println();
            if(number<=seatsNumber){
                System.out.println("The number of seats in room is OK");
            }else {
                System.out.println("The number of seats in room is NOT OK");
            }
            if(arrangement[time-1][day-1]==0){
                System.out.printf("The room at day_%d time_%d is OK",day,time);
            }else {
                System.out.printf("The room at day_%d time_%d is NOT OK",day,time);
            }
        }
    }
}
