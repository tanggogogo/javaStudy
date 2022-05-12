package jichu.xianxinguihua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        long[][] f = new long[25][25];
        int[][] g = new int[25][25];
        g[m][n] = 1;
        if (m > 1 && n != 0){ g[m-2][n-1] = 1; }
        if (m > 1 && n != 20){ g[m-2][n+1] = 1; }
        if (m < 19 && n != 0){ g[m+2][n-1] = 1; }
        if (m < 19 && n != 20){ g[m+2][n+1] = 1; }
        if (m != 0 && n < 19){ g[m-1][n+2] = 1; }
        if (m != 0 && n > 1){ g[m-1][n-2] = 1; }
        if (m !=20 && n < 19){ g[m+1][n+2] = 1; }
        if (m != 20 && n > 1){ g[m+1][n-2] = 1; }

        for (int i = 0; i <= x; ++i) {
            for (int j = 0; j <= y; ++j) {
                if(g[i][j]!=1){
                    if(i == 0 && j == 0){
                        f[i][j] = 1;
                    }else if(i == 0){
                        f[0][j] = f[0][j-1];
                    }else if(j == 0){
                        f[i][0] = f[i-1][0];
                    }else{
                        f[i][j] = f[i-1][j] + f[i][j-1];
                    }
                }
            }
        }
        System.out.println(f[x][y]);

    }
}
