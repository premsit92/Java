package ex_20042024;

public class Lab064 {
    public static void main(String[] args) {
        String password = "Prem@123";
        String pass_u = password.toLowerCase();
        //pass_u == password -- Ref are not equal
        //pass_u.equals(password) -- NO
        //pass_u.equalsIgnoreCase(password) -- YES

        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));

        System.out.println(password.substring(0,5));
        System.out.println(password.indexOf("r"));


    }
}
