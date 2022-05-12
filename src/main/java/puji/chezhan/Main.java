package puji.chezhan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();

        int peo = 0;
        for (int i = 0; i <= 20; i++) {
            int up1 = a+i;
            int up2 = a+2*i;
            peo = 2*a+i;
            int[] xx = new int[8];
            for (int j = 5; j < n; j++) {
                if (j%2==0){
                    peo = peo + up2;
                    up2 = up1 + up2;
                    xx[j] = peo;
                }else{
                    peo = peo + up1;
                    up1 = up1 + up2;
                    xx[j] = peo;
                }
            }
            if (peo == m){
                if (x==2){
                    System.out.println(a);
                }else if (x==3){
                    System.out.println(2*a);
                }else if(x==4){
                    System.out.println(2*a+i);
                }else {
                    System.out.println(xx[x]);
                }
                break;
            }
        }
    }
}
