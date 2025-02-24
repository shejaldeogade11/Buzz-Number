package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

//Buzz number means number is divisible by 7 or remainder should be zero
public class BuzzNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is buzz Number");
        } else {
            System.out.println(num + " is not  buzz Number");
        }
    }
}
