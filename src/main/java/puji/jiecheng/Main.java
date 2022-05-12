package puji.jiecheng;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        BigInteger temp = BigInteger.valueOf(0);
        for (int j = 1;j <= S;j++){
            BigInteger num = BigInteger.valueOf(1);
            for (int i = j; i > 0; i--) {
                num=num.multiply(BigInteger.valueOf(i));
            }
            temp=temp.add(num);
        }
        System.out.println(temp);
    }
}
