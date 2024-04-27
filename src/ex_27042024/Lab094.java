package ex_27042024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        //Program to check if a number is Positive, Negative or Zero
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive Number");

        } else if ( num < 0) {
            System.out.println("Negative number");

        }
        else {
            System.out.println("ZERO");
        }
        sc.close();

        System.out.println();
    }
}
