package dp.qushu;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static long[][] nm;
    private static int n;
    private static int m;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        nm = new long[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                nm[i][j]=scanner.nextInt();
            }
        }
        BigInteger dps = BigInteger.valueOf(0);
        for (int i = 1; i <= n; i++) {
            dps =dps.add(dps(i, 1, m, 1));
        }
        System.out.println(dps);
    }

    private static BigInteger dps(int x,int y1,int y2,int temp) {
        if(nm[x][y1]<=nm[x][y2]){
            return y1==y2? BigInteger.valueOf((long) (nm[x][y1]*Math.pow(2,temp))):dps(x,y1+1,y2,temp+1).add(BigInteger.valueOf((long) (nm[x][y1]*Math.pow(2,temp))));
        }else{
            return y1==y2? BigInteger.valueOf((long) (nm[x][y1]*Math.pow(2,temp))):dps(x,y1,y2-1,temp+1).add(BigInteger.valueOf((long) (nm[x][y2]*Math.pow(2,temp))));
        }
    }
}
