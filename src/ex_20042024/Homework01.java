package ex_20042024;
//Max between 3 Numbers with ? operators.
public class Homework01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int result = ( a > b )?( a > c ? a : c ) : ( b > c ? b : c );
        System.out.println(result);

    }
}
