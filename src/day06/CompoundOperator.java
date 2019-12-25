package day06;

public class CompoundOperator {
    public static void main(String[] args) {

       //Assignment Operator =
        //--> will save the result of whatever operation on the right side
        //and assign the result to the left side variable

        int studentOnline =263;
        studentOnline=studentOnline;
        System.out.println("Online students:" + studentOnline);

        studentOnline = studentOnline +5;
        System.out.println("5 people joined the class " + studentOnline);

        studentOnline = studentOnline-3;
        System.out.println("3 people left the class " + studentOnline);

        studentOnline = studentOnline*2;
        System.out.println("student count doubled " + studentOnline);

        studentOnline = studentOnline/3;
        System.out.println("student dropped to 1/3: " + studentOnline);
    }
}
