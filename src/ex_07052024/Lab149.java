package ex_07052024;

public class Lab149 {
    public static void main(String[] args) {
        //Function whiich will say Hi
        for (int i=0; i<99;i++){
            sayHi();
            sayBye();
            rama();

        }
    }

    private static void rama() {
        System.out.println("Rama");
    }

    static void sayBye() {
        System.out.println("Bye");
    }

    static void sayHi(){
        System.out.println("Hello Hi");
    }
}
