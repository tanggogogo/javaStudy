package jichu.thetwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] array = new int[i];
        for (int i1 = 0; i1 < i; i1++) {
            array[i1] = scanner.nextInt();
        }

        array=sortArray(array);
        for (int i1 : array) {
            System.out.print(i1+" ");
        }
    }


    //冒泡排序
    public static int[] sortArray(int[] array){
        for (int i = 1; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return array;
    }
}
