package ex_07052024;

public class Lab159 {
    public static void main(String[] args) {
        //Web Automation
        openDataBase();
        openBrowser();
        testLoginPage1();
        testLoginPage("page1");
        closeBrowser();
    }
    static void openDataBase(){
        System.out.println("Database connection Started");
    }
    static void openBrowser(){
        System.out.println("Chrome Browser Opened");
    }
    static void testLoginPage1(){
        System.out.println("Testing Page 1 opened");
    }
    static void testLoginPage(String page){
        System.out.println("Testing --> "+ page);
    }
    static void closeBrowser(){
        System.out.println("Chrome Browser Closed");
    }
}
