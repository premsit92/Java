package ex_23042024;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        // Grade Calculator
        // Write a program that calculates and displays the letter grade for a given
        //numerical score (e.g A,B,C,D or F) based on the following
        //Grading Scale
        //A : (90-100)
        //B : (80-89)
        //C : (70-79)
        //D : (60-69)
        //F : (0-59)

        //1. Find the user inputs
        //score -- data type? - int
        //return --> Grade --> Data type --> char
        // DAA- ask for the confirmation of the doubt
        // interviewer --> Int, char

        // Basic Logic
        // if (score >= 90 && score <= 100) --> return or Print grade A
        // if (score <= 89 && score >= 80) --> return or Print grade B
        //else --> grade  --> F

        // Write the code.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score !! :" );
        int score = sc.nextInt();
        char grade = 'F';
        if (score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade ='B';
        }
        else if (score >= 70 && score <= 79) {
            grade ='C';
        }
        else if (score >= 60 && score <= 69) {
            grade ='D';
        } else if (score > 100) {
            System.out.println("Invalid Input");
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is " +grade);
        sc.close();

    }
}
