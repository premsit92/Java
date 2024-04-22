package ex_20042024;

public class Homework04 {
    public static void main(String[] args) {
        int x = 10;
        float y = 12.4f;
        float z = 56.78f;
        double sum = Math.pow(x,2) + Math.pow(y,2) - Math.abs(z);
        double result = Math.cbrt(sum);
        System.out.println(result);
    }
}
