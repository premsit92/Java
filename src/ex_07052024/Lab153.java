package ex_07052024;

public class Lab153 {
    public static void main(String[] args) {
        //non return with no parameter
        saySomethingPlease();
        //non return with parameter
        sayHelloToYou("Prem");
        //return with no paarameter
        sumOfTwoBad(3,4);
        //return with parameter

        int result = sumOfTwoGood(10,12);
        System.out.println(result);

    }

    static int sumOfTwoGood(int i, int i1) {
        return i+i1;
    }

    static void sumOfTwoBad(int i, int i1) {
        System.out.println(i+i1);
    }

    static void sayHelloToYou(String name)
    {
        System.out.println("Hello "+name);
    }

    static void saySomethingPlease() {
        System.out.println("non return with no parameter");
    }
}
