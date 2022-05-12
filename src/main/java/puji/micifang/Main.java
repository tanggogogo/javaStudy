package puji.micifang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(biao(n));
    }

    static String biao(int num){
        if (num == 3){
            return "2+2(0)";
        }
        if(num == 2){
            return "2";
        }
        if(num == 1){
            return "2(0)";
        }

        for (int i = 2; i <= 15; i++) {
            if (num < (int)(Math.pow(2,i))){
                int a = num-(int)(Math.pow(2,i-1));
                if (a!=0){
                    return "2("+biao(i-1)+")"+"+"+biao(a);
                }else{
                    return "2("+biao(i-1)+")";
                }
            }
        }
        return "";
    }
}
