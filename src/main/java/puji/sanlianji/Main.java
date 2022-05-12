package puji.sanlianji;

public class Main {
    public static void main(String[] args) {
        for (int a = 123;a < 333;a++){
            int b = 2*a;
            int c = 3*a;
            if(first(a)+second(a)+third(a)+first(b)+second(b)+third(b)+first(c)+second(c)+third(c)==45&&first(a)*second(a)*third(a)*first(b)*second(b)*third(b)*first(c)*second(c)*third(c)==362880){
                System.out.println(a+" "+b+" "+c);
            }
        }
    }

    static int first(int num){
        return (int)(num/100);
    }

    static int second(int num){
        return (int)(num%100/10);
    }

    static int third(int num){
        return (int)(num%10);
    }
}
