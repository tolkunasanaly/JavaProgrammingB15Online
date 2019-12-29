package day34;

public class OverloadingPractice {
    public static void main(String[] args) {

        add(45,45);
        add(100);
        add(12,10,20);
        add(50L,10L);
    }

    /*
    * create 4 static void overloaded version of add method
	1, add
		has 1 int parameter and add 100 to that number
		and print out the result
	2, add
		has 2 int parameters and add them to get sum
		and print out the result
	3, add
		has 3 int parameters and add them to get sum
		and print out the result
	4, add
		has 2 long parameters and add them to get sum
		and print out the result
    * */

    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("1. "+sum);
    }

    public static void add(int num1) {
        //DO I ALREADY HAVE A METHOD THAT ADD 2 NUMBERS
        int result = num1 + 100;
       System.out.println("2. "+result);


    }

    public static void add(int num1, int num2, int num3) {
        int sum = num1 + num2+num3;
        System.out.println("3. "+sum);
    }
    public static void add(long num1, long num2) {
        long sum = num1 + num2;
        System.out.println("4. "+sum);
    }
}
