package jichu.meiju;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] g = new int[n];
        int[] k = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            g[i] = scanner.nextInt();
            k[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = a.length-1; i >= 0; i--) {
            if(x >= a[i] && x <= a[i]+g[i] && y >= b[i] && y <= b[i]+k[i]){
                System.out.println(i+1);
                break;
            }
            if(i == 0){
                System.out.println(-1);
                break;
            }
        }
    }
}
