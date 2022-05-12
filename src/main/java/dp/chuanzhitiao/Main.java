package dp.chuanzhitiao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][][][] dp = new int[51][51][51][51];
        int[][] xy = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                xy[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    for (int l = 1; l <= n; l++) {
                        dp[i][j][k][l] = mymax(dp[i-1][j][k-1][l],dp[i-1][j][k][l-1],dp[i][j-1][k-1][l],dp[i][j-1][k][l-1])+xy[i][j]+xy[k][l];
                        if (i==k&&j==l){
                            dp[i][j][k][l]-=xy[k][l];
                        }
                    }
                }
            }
        }
        System.out.println(dp[m][n][m][n]);
    }

    static int mymax(int a,int b,int c,int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
}
