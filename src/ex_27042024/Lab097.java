package ex_27042024;

import java.util.Scanner;

public class Lab097 {
    public static void main(String[] args) {
        //Program to Check if a Year is a Leap Year or Not:
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year!");
        }else {
            System.out.println("Not a Leap Year!");
        }
    }
}