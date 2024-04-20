package ex_20042024;

public class Lab059 {
    public static void main(String[] args) {
        String name = "THE TESTING ACADEMY"; //String Constant Pool (SCP)
        String name1 = "THE TESTING ACADEMY"; // SCP
        String name2 = new String("THE TESTING ACADEMY"); //HEAP Area/Object AREA

        System.out.println(name == name1); //check the ref.
        System.out.println(name.equals(name1)); //check the values.
        System.out.println(name.equals(name2)); //check the values.
        System.out.println(name == name2); //check the Ref.


    }
}
