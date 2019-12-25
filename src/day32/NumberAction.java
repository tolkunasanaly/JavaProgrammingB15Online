package day32;

public class NumberAction {
    public static void main(String[] args) {


        numberComparison(6,12);
        StringRepeater("Java",3);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(12);
        countDownByEvenNumberFromXToY(10,6);
        countDownByEvenNumberFrom50to0();


    }

    /**
     * Create static void methods as below
     * <p>
     * numberComparision
     * this method has 2 parameters called num1 and num2
     * if num1 is more than num2 print num1 is more than num2
     * if num2 is more than num1 print num2 is more than num1
     * if num2 are equals num1 print they are equal
     */
    public static void numberComparison(int num1, int num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is more than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is more than " + num1);
        } else if (num2 == num1) {
            System.out.println(num2 + " is equal to " + num1);
        }
        System.out.println("===================");
    }

    /* String repeater
     * this method has 2 parameters
     *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
     */
    public static void StringRepeater(String strToRepeat, int count) {
        for (int i = 0; i <=count ; i++) {
            System.out.println(strToRepeat+ " ");
        }
        System.out.println("============");
    }

    /* skipCountBy3From0to50
     *
     * * create a method that has no parameter
     * and skip count by 3 from 0 to 50
     */
    public static void skipCountBy3From0to50() {
        System.out.println();
        for (int i = 0; i <= 50; i++) {   //i=i+3

            if (i % 3 != 0)
                continue;
            System.out.println(i + " ");
        }

        System.out.println("======================");
    }
    /* countDownByEvenNumberFrom50to0
     * * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     */
    public static void countDownByEvenNumberFrom50to0() {

//        for (int i = 50; i >= 0; i--) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
        countDownByEvenNumberFromXToY(50,0);
    }
// instead of counting down by even number from 50 to 0
    //now countDownByEvenNumberFromXToY
    public static void countDownByEvenNumberFromXToY(int x, int y){

        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }



    /* print1toX
     * * create a method that has 1 int parameter called x
     * print from 1 to that number in one line
     * print an empty line after the print.
     */
    public static void print1toX(int x) {

        for (int i = 0; i <= x ; i++) {
            System.out.print(i+" ");

        }
return;
    }
}

