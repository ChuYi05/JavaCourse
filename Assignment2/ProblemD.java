package Assignment2;
//另法：在确定了形状之后，长方形可以按照正方形减去第一列来处理
//由于本程序处理字符串的方法，如果输入的是数字十，会被识别为1和0

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String origin = input.nextLine();
        char[] withWhiteSpcaes = origin.toCharArray();
        ArrayList<Character> withNotWhiteSpaces = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < withWhiteSpcaes.length; i++) {
            if (!Character.isWhitespace(withWhiteSpcaes[i])) {
                withNotWhiteSpaces.add(withWhiteSpcaes[i]);
                s++;
            }
        }//将读到的字符串转化为字符的数组，并且去掉其中的空格，得到withNOTWhiteSpaces[]

        int a;
        String shape;
        for (int i = 0; ; i++) {
            if (i * i < s && s <= i * (i + 1)) {
                a = i;
                shape = "rectangular";
                break;
            } else {
                if (i * (i + 1) < s && s <= (i + 1) * (i + 1)) {
                    a = i + 1;
                    shape = "square";
                    break;
                }
            }
        }//确定形状，注意可能是长方形或者正方形

        if (shape == "square") {
            char[][] spiralEncryption = new char[a][a];
            int n = 1;
            if (a % 2 == 1) {//当边长为奇数和偶数的时候，起点的坐标不同
                int x = a / 2, y = a / 2;
                spiralEncryption[x][y] = withNotWhiteSpaces.get(0);
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < i; j++) {
                        y = y + (int) (Math.pow(-1, i + 1));
                        spiralEncryption[x][y] = withNotWhiteSpaces.get(n % s);
                        n++;
                    }
                    for (int k = 0; k < i + 1; k++) {
                        if (n != a * a) {
                            x = x + (int) (Math.pow(-1, i + 1));
                            spiralEncryption[x][y] = withNotWhiteSpaces.get(n % s);
                            n++;
                        } else {
                            break;
                        }
                    }
                }
            } else {
                int x = a / 2, y = a / 2 - 1;
                spiralEncryption[x][y] = withNotWhiteSpaces.get(0);
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < i; j++) {
                        y = y + (int) (Math.pow(-1, i + 1));
                        spiralEncryption[x][y] = withNotWhiteSpaces.get(n % s);
                        n++;
                    }
                    for (int k = 0; k < i + 1; k++) {
                        if (n != a * a) {
                            x = x + (int) (Math.pow(-1, i + 1));
                            spiralEncryption[x][y] = withNotWhiteSpaces.get(n % s);
                            n++;
                        } else {
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < spiralEncryption.length; i++) {
                for (int j = 0; j < spiralEncryption[0].length; j++) {
                    System.out.print(spiralEncryption[i][j]);
                }
                System.out.println();
            }//打印
        }


        if (shape == "rectangular") {
            char[][] spiralEncryption = new char[a+1][a];
            int n = 1;
            int x = a / 2+1, y = a / 2;
            spiralEncryption[x][y] = withNotWhiteSpaces.get(0);
            for (int i = 0; i < a; i++) {//先将上一个正方形画完
                for (int j = 0; j < i; j++) {
                    y = y + (int) (Math.pow(-1, i + 1));
                    spiralEncryption[x][y] = withNotWhiteSpaces.get(n % s);
                    n++;
                }
                for (int k = 0; k < i + 1; k++) {
                    x = x + (int) (Math.pow(-1, i + 1));
                    spiralEncryption[x][y] = withNotWhiteSpaces.get(n % s);
                    n++;
                }
            }
            for(int i=0;i<a-1;i++){//再将最后一行补上
                y=y+(int)(Math.pow(-1,a+1));
                spiralEncryption[x][y]=withNotWhiteSpaces.get(n%s);
                n++;
            }

            for (int i = 0; i < spiralEncryption.length; i++) {
                for (int j = 0; j < spiralEncryption[0].length; j++) {
                    System.out.println(spiralEncryption[i][j]);
                }

            }//打印
        }
    }
}
