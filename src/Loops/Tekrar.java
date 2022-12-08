package Loops;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int zero = 0 , one = 0 , two = 0 , three = 0 ,  four = 0 ,five = 0 , six = 0 , seven = 0 , eight = 0 , nine = 0;
        while(input > 0){
            int check = input % 10;
            switch(check){
                case 0 : zero++; break;
                case 1 : one++;break;
                case 2 : two++;break;
                case 3 : three++;break;
                case 4 : four++;break;
                case 5 : five++;break;
                case 6 : six++;break;
                case 7 : seven++;break;
                case 8 : eight++;break;
                case 9 : nine++;break;
            }
            input = input / 10;
        }
        System.out.printf("zero: %d\none: %d\ntwo: %d\nthree: %d\nfour: %d\nfive: %d\nsix: %d\nseven: %d\neight: %d\nnine: %d\n" , zero ,one , two , three , four , five , six , seven , eight , nine  );
    }
}

