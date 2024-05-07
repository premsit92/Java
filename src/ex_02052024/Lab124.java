package ex_02052024;

public class Lab124 {
    public static void main(String[] args) {
        int [] ages = {27,31,32,33,34};
        //fixed element

        int [] ages2 = new int[5];
        //case 2 - Here by default value of all the element will be?
        System.out.println(ages2[0]);
        System.out.println(ages2[2]);

        ages2[0] = 11;
        System.out.println(ages2[0]);

        String [] breakfast_items = {"milk", "idly","fruits", "coffee", "tea", "poha"};
        System.out.println(breakfast_items.length);

    }
}
