//package Loops;

import java.util.Scanner;

public class DeleteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        int resultValue = 0;
        boolean evenFound = false;
//        238
//        0
        while (n>0){
            int check = n % 10;
//            check 8
//            check 3
//            check 2
            if(check % 2 == 0){
                evenFound = true;
                for(int i = 0 ; i < resultValue ; i++){
                    check *=10;
                }
                result = result + check;
//                result = 8
//                result = 28
                resultValue++;
//                result value = 1
            }

            n = n / 10;
        }
        if(evenFound){
            System.out.println(result);
        }else{
            System.out.println("All digits were deleted");
        }
    }
}
