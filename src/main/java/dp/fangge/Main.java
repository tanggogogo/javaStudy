package dp.fangge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][][][] dp = new int[11][11][11][11];
        int[][] xy = new int[N+1][N+1];
        int x = -1;
        int y = -1;
        int z = -1;
        while (!(x==0&&y==0&&z==0)){
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();
            xy[x][y] = z;
        }

        for (int i=1;i<=N;i++){
            for (int j=1;j<=N;j++){
                for (int k=1;k<=N;k++){
                    for (int l=1;l<=N;l++){
                        dp[i][j][k][l] = mymax(dp[i-1][j][k-1][l],dp[i-1][j][k][l-1],dp[i][j-1][k-1][l],dp[i][j-1][k][l-1])+xy[i][j]+xy[k][l];
                        if (i==k&&j==l){
                            dp[i][j][k][l]-=xy[k][l];
                        }
                    }
                }
            }
        }
        System.out.println(dp[N][N][N][N]);
    }

    static int mymax(int a,int b,int c,int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }

}
