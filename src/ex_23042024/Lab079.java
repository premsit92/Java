package ex_23042024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        //Triangle Classifier
        //Write a program to  classify the triangle.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1, Side 2 , Side 3, I will tell about the Triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side1 == side3) && (side2 == side3)){
            System.out.println("EQ");
        }
        else if ((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("isosceles");
        }else {
            System.out.println("Scalene");
        }


    }
}
