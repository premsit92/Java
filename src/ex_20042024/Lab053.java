package ex_20042024;

public class Lab053 {
    public static void main(String[] args) {
        String name = "Prem"; //Assignment operator
        String name2 = new String("Prem"); //New operator
        //Both of them, actually save the name, name2 in diffferent ways JVM
        //How they store the value in the JVM?

        System.out.println(name);
        System.out.println("Your name is "+name);
        System.out.printf("Your name is %s",name);
        System.out.println("\n--All the functions available in String --");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());



    }
}
