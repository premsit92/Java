package ex_18042024;

public class Lab043 {
    public static void main(String[] args) {
        float course = 100;
        float GST = 18.45f;
        double total = course + GST;
        double total1 = course + (int)GST;

        System.out.println(total);
        System.out.println(total1);
    }
}
