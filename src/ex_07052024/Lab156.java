package ex_07052024;

public class Lab156 {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        System.out.println("End of the Program");
        main(10);
        main("Prem");
        main("Prem", "Kumar");


    }
    static void main (int a){
        System.out.println(a);
    }

    static String main (String a){
        System.out.println(a);
        return a;
    }
    static void main (String a, String b){
        System.out.println(a);
    }

    static void god(){
        main(new String[]{"12"});
    }
    static void giveMoneyBeg() {
        System.out.println("Blessing");
    }

    static int giveMoneyFriend(int i) {
        //After 6 Month
        return i;
    }
}