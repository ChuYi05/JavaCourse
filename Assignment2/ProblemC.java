package Assignment2;

import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<3){

        }else {
            double[][] allXYZ = new double[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    allXYZ[i][j] = Double.valueOf(input.nextInt());
                }
            }
            double Area1, Area2;
            Area1 = Math.sqrt(Math.pow((allXYZ[1][1] - allXYZ[0][1]) * (allXYZ[2][2] - allXYZ[0][2]) - (allXYZ[1][2] - allXYZ[0][2]) * (allXYZ[2][1] - allXYZ[0][1]), 2) + Math.pow((allXYZ[1][2] - allXYZ[0][2]) * (allXYZ[2][0] - allXYZ[0][0]) - (allXYZ[1][0] - allXYZ[0][0]) * (allXYZ[2][2] - allXYZ[0][2]), 2) + Math.pow((allXYZ[1][0] - allXYZ[0][0]) * (allXYZ[2][1] - allXYZ[0][1]) - (allXYZ[1][1] - allXYZ[0][1]) * (allXYZ[2][0] - allXYZ[0][0]), 2))/ 2.0;
            int number=0;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        double t;
                        if (allXYZ[j][0] - allXYZ[i][0] == 0 && allXYZ[k][0] == allXYZ[i][0]) {
                            number++;
                        } else {
                            t = (allXYZ[k][0] - allXYZ[i][0]) / (allXYZ[j][0] - allXYZ[i][0]);
                            if (allXYZ[k][1]-allXYZ[i][1] == t * (allXYZ[j][1] - allXYZ[i][1]) && allXYZ[k][2]-allXYZ[i][2] == t * (allXYZ[j][2] - allXYZ[i][2])) {
                                number++;
                            } else {
                                Area2 = Math.sqrt((Math.pow((allXYZ[j][1] - allXYZ[i][1]) * (allXYZ[k][2] - allXYZ[i][2]) - (allXYZ[j][2] - allXYZ[i][2]) * (allXYZ[k][1] - allXYZ[i][1]), 2) + Math.pow((allXYZ[j][2] - allXYZ[i][2]) * (allXYZ[k][0] - allXYZ[i][0]) - (allXYZ[j][0] - allXYZ[i][0]) * (allXYZ[k][2] - allXYZ[i][2]), 2) + Math.pow((allXYZ[j][0] - allXYZ[i][0]) * (allXYZ[k][1] - allXYZ[i][1]) - (allXYZ[j][1] - allXYZ[i][1]) * (allXYZ[k][0] - allXYZ[i][0]), 2))) / 2;
                                if (Area2 >= Area1) {
                                    Area1 = Area2;
                                }
                            }
                        }
                    }
                }
            }
            if(number==(n-1)*(n-2)/2){//通过number来计共线的次数，如果所有3个点的组合都是共线的，则不打印Area1

            }else {
                System.out.printf("%.2f", Area1);
            }
        }
    }
}
