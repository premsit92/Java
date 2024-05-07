package ex_02052024;

public class Lab127 {
    public static void main(String[] args) {
        //== --> reference
        //.equals --> values/content
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1 == arr2);


        int [] arr3 = arr1;

        //
        System.out.println(arr1 == arr3);
        System.out.println(arr1.equals(arr2)); //Objects.java file which checks for Reference only

        String a1 = "Prem";
        String a2 = "Prem";
        System.out.println(a1.equals(a2)); // Strings.java which checks for content

        //Object class is a parent of every call.
//    Object is a father of every class



    }
}
