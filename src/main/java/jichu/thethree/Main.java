package jichu.thethree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(meiju(i));
    }

    public static String meiju(int i){
        int sum = 2;
        int temp =1;
        int m = 1;
        int n = 1;
        while (temp < i){
            temp++;
            if (m == 1){
                sum++;
                m= sum - 1;
                n = 1;
            }else{
                n++;
                m--;
            }
        }
        return n+"/"+m;
    }
}
