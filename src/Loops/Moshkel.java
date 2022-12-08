package Loops;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Moshkel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        boolean isValid = true;

        for(int i = 0 ; i < input.length() ; i++){
            // invalid chars
            if (input.charAt(i) == '{' || input.charAt(i) == '}') {
                isValid = false;
                break;
            }
        }
        if(isValid){
            System.out.println("VALID");
        }else{
            System.out.println("INVALID");
        }
        scanner.close();
    }
}
