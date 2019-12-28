package day34;

public class MathACtion {
    //calling the static methods of other classes
    public static void main(String[] args) {
        //call your build3DigitNumber method here
        // build3DigitNumber is under day34 package
        //and inside PracticeMethodWithNumbers class
        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        //in order to use Arrays class
        //    that coming from java.util package (NOT YOUR PACKAGE)


    }
}
