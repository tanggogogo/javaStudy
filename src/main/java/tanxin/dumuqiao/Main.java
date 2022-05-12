package tanxin.dumuqiao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int N = scanner.nextInt();
        int maxv = 0;
        int minv = 0;
        int num;
        for (int i = 0; i < N; i++) {
            num = scanner.nextInt();
            minv = Math.max(Math.min(num,L+1-num),minv);
            maxv = Math.max(Math.max(num,L+1-num),maxv);
        }
        System.out.println(minv+" "+maxv);
    }
}
