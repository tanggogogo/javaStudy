package jichu.zoushuhe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] num = new int[N][N];
        int temp = 0;
        for (int i = 0; i < N*N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            num[a][b]=c;
            if (a==0&&b==0&&c==0){
                temp = i;
                break;
            }
        }
        int[][] numN = new int[temp][temp];
        numN=num;
        int summ = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (numN[i][j]!=0){
                    summ = summ + numN[i][j];
                }
            }
        }

    }
}
