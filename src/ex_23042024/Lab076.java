package ex_23042024;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 20){
            System.out.println("num > 20");

        } else if (number > 10) {
            System.out.println("num > 10");
        }else {
            System.out.println("num < 20");
        }
    }
}
