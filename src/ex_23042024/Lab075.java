package ex_23042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        //Max Number in Two
        System.out.println(" Enter 1st Number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        int max = Math.max(num2,num1);
        System.out.println("Max is the " +max);
        if(num1>num2){
            System.out.println("Max is " +num1);
        }
        else {
            System.out.println("Max is " +num2);
        }
        sc.close();
    }
}
