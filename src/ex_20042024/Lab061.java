package ex_20042024;

public class Lab061 {
    public static void main(String[] args) {
        String s1 = "Pramod";
      //  |0|1|2|3|4|5|
       // |P|R|A|M|O|D|

        char c = s1.charAt(4);
        System.out.println(c);
        boolean result = s1.contains("i");
        System.out.println(result);
        s1 = s1.concat("Dutta");

        System.out.println(s1);

    }
}
