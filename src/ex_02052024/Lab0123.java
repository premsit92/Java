package ex_02052024;

public class Lab0123 {
    public static void main(String[] args) {
        int a = 10;
        //Arrays
        // Collection of Similar Data Type
          int [] ages = {27,31,32,33,34};
//        int [] ages2 = new int[5];
//        ages2[0] = 27;
//        ages2[1] = 31;
//        ages2[2] = 32;
//        ages2[3] = 33;
//        ages2[4] = 34;


        System.out.println(ages);
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages.length);
        System.out.println(ages[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        System.out.println(ages[-2]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5


    }
}
