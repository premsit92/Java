package ex_27042024;

public class Lab113 {
    public static void main(String[] args) {
        //continue--> if this is true -> continue the loop
        for (int i=1; i<10;i++){
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("After!!");
        }
    }
}
