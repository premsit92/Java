package ex_07052024;

public class Lab157 {
    public static void main(String[] args) {
        f1();
        String[] names = {"Prem", "Kumar"};
        String[] names1 = new String[2];
        names1[0] = "Prem";
        names1[1] = "Kumar";



        f1(names);

    }
    static void f1(String[] a){
        for(String name : a){
            System.out.println(name);
        }
    }
    static void f1() {
        f2();
        System.out.println("F1");
    }

    static void f2() {
        System.out.println("F2");
    }

}
