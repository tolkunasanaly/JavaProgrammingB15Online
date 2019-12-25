package day21;

public class OrderOfBreak_Continue {
    public static void main(String[] args) {
        for (int x=1; x<=10; x++){
           // break;
            continue;
            //THIS WILL NOT WORK, UNREACHABLE CODE!!!
            //System.out.println("Hello");
        }
        System.out.println("The End");
    }
}
