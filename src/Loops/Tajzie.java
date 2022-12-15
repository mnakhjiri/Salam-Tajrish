//package Loops;

import java.util.Scanner;

public class Tajzie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean firstFound = false;
//        finding prime number from 2 to n
        outer:for(int i = 2;i<=n;i++){
            for(int j = 2 ; j <=i/2 + 1 ; j++){
                if(i % j == 0 && i!=2){
                    continue  outer;
                }
            }
            if(n % i != 0){
                continue ;
            }
            int temp = n;
            int power = 0;
            while(temp>0 && temp%i == 0){
                power+=1;
//                100     50      25   //>>>>   12 ....
                temp/=i;
            }
            if(power >1){
                if(!firstFound){
                    System.out.printf("%d^%d" , i , power);
                }else{
                    System.out.printf("*%d^%d" , i , power);
                }
            }else{
                if(!firstFound){
                    System.out.printf("%d" , i );
                }else{
                    System.out.printf("*%d" , i );
                }
            }
            if(!firstFound){
                firstFound = true;
            }
        }
    }
}
