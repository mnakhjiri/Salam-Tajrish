//package Loops;

import java.util.Scanner;

public class almas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = n ; i>=1 ; i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < 2*n - 2*i;j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int a;
        if(n%2==0){
            a = 2;
        }else{
            a = 1;
        }
        for(int i = a ; i<=n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < 2*n - 2*i;j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
