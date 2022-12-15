package Loops;

import java.util.Scanner;

public class Jomalat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long sum = 0;
        long sign = 1;
        for(long i = 1 ; i <= n ; i++){
//            (10 ^ yechizi - 1)
            long element = 1;
            for(long j = 0 ; j < i ; j++){
                element *= 10;
            }
            element --;
            element *= sign;
            sum += element;
            sign *=-1;
        }
        System.out.print(sum);
        scanner.close();
    }
}

