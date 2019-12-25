package day06;

public class CompoundOperator2 {
    public static void main(String[] args) {

        //+=. -=, *=, /=, %=  are called shorthand operator, compound operator
        // on both side of the assignment


        int studentOnline =263;

        studentOnline=studentOnline;
        System.out.println("Online students:" + studentOnline);

        studentOnline +=5;
        System.out.println("5 people joined the class " + studentOnline);

        studentOnline -= 3;
        System.out.println("3 people left the class " + studentOnline);

        studentOnline *=2;
        System.out.println("student count doubled " + studentOnline);

        studentOnline /= 3;
        System.out.println("student dropped to 1/3: " + studentOnline);
    }
}
