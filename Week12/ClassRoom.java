package Week12;

import java.io.PrintWriter;

public class ClassRoom {
    int id;
    int seatsNumber;
    int[][] TheArragementOfTheClassRoom = new int[5][7];

    ClassRoom() {
    }//默认构造方法

    ClassRoom(int id, int seats, int[][] arragement) {
        this.id = id;
        seatsNumber = seats;
        TheArragementOfTheClassRoom = arragement;
    }//构造方法

    public int getID(ClassRoom cr) {
        int id = cr.id;
        return id;
    }

    public int getSeatsNumber(ClassRoom cr) {
        int seatsNumber = cr.seatsNumber;
        return seatsNumber;
    }

    public int[][] getArrangement(ClassRoom cr) {
        int[][] arragement = cr.TheArragementOfTheClassRoom;
        return arragement;
    }

    public void toString(ClassRoom cr) {
        System.out.printf("ClassRoom[id:%d,seats:%d] plan: Room #%d with seats(%d)", cr.id, cr.seatsNumber, cr.id, cr.seatsNumber);
        System.out.println();
    }

    public void printRoom() {
        System.out.printf("ClassRoom[id:%d,seats:%d] plan: ", id, seatsNumber);
        System.out.println();
        System.out.print("           ");
        for (int i = 0; i < 7; i++) {
            System.out.print("Day" + (i + 1) + "      ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "(" + (2 * i + 1) + "_" + (2 * i + 2) + ")" + "       ");
            for (int j = 0; j < 7; j++) {
                System.out.print(TheArragementOfTheClassRoom[i][j] + "         ");
            }
            System.out.println();
        }
        System.out.print("5(9_10)      ");
        for (int j = 0; j < 7; j++) {
            System.out.print(TheArragementOfTheClassRoom[4][j] + "         ");
        }
        System.out.println();
    }//打印教室安排到System.out

    public void printRoom2() {
        System.out.printf("%d,%d", id, seatsNumber);
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print("("+(i + 1) + "_" + (2 * i + 1) + ")"+",");
            for (int j = 0; j < 7; j++) {
                System.out.print(TheArragementOfTheClassRoom[i][j] + ",");
            }
            System.out.println();
        }
        System.out.print("(5_9),");
        for (int j = 0; j < 7; j++) {
            System.out.print(TheArragementOfTheClassRoom[4][j] + ",");
        }
        System.out.println();
    }//打印教室安排到PrintWriter.out

    public boolean isValidforExam(int day, int time, int seats) {
        boolean result = false;
        if (TheArragementOfTheClassRoom[time - 1][day - 1] == 0 && seats <= seatsNumber) {
            result = true;
        }
        return result;
    }//判断合格
}


