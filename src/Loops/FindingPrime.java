//package Loops;

import java.util.Scanner;

public class FindingPrime {
    public static void main(String[] args) {
//        [a,b]
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean firstReached = false;
        outer:for(int i = a ; i <=b ; i++){
            if( i <= 1){
                continue;
            }
            inner:for(int j = 2 ; j <=i/2 + 1 ; j++){

                if(i % j == 0 && i!=2){
                    continue  outer;
                }
            }
            if(!firstReached){
                System.out.print(i);
                firstReached = true;
            }else{
                System.out.printf(",%d" , i);
            }
        }
    }
}
