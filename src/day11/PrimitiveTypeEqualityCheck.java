package day11;

class PrimitiveTypeEqualityCheck {
    public static void main(String[] args) {

        //String name ="Tolkun";
        char c1 = 'b';
        char c2 = 'B';
        char c3 = 'b';

        System.out.println("Is c1 equal to c2?");
        System.out.println(c1==c2);

        System.out.println("Is c1 equal to c3?");
        System.out.println(c1==c3);

        // all primitive types can be compared using == for their content equality
        //primitive types are pure value

        int num1 = 10;
        int num2 = 10;
        System.out.println("Is num1 equal to num2?");
        System.out.println(num1==num2);

    }
}
