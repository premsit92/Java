package ex_23042024;

import java.util.Scanner;

public class Lab074 {

    public static void main(String[] args) {
        //Even and Odd Number
        // 1 Odd Number
        // 4 Even Number
        // num%2 == 0 --> Even
        // else it is odd.

        Scanner sc = new Scanner(System.in); //Taking an input from User
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("ODD");
        }

        sc.close();
    }
}
