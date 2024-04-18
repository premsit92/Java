package ex_18042024;

public class Lab045 {
    public static void main(String[] args) {
        //Post --> Value will be first used for computing the result then increment/decrement.
        int b = 12;
        int b1 = b++;
        System.out.println(b1);
        System.out.println(b);

    }
}
