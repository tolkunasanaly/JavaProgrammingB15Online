package day32;

public class compare {
    public static void main(String[] args) {
        int num1=3;
        int num2=4;

        if (num1 > num2) {
            System.out.println(num1 + " is more than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is more than " + num1);
        } else if (num2 == num1) {
            System.out.println(num2 + " is equal to " + num1);
        }
        System.out.println();
    }
}
