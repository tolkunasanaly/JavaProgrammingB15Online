package Homeworks;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            System.out.println("MULTIPLICATION TABLE OF: " + i);
            for (int y = 1; y <= 12; y++) {
                System.out.println(i + "*" + y + " = " + (i * y));
            }
        }
    }
}
