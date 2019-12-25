package day10;

public class Calculator {
    public static void main(String[] args) {

        /*
        *Create a variable called operator with type char
        * Assign the value for one of these 4: +-* /
        * use switch statement to do following logic
        */
         char operator ='/';
        /* if the operator is + print you are about to add numbers
        * if the operator is - print you are about to subtract numbers
        * if the operator is * print you are about to multiply numbers
        * if the operator is / print you are about to divide numbers
        * if nothing match print invalid operator
        **/
        switch (operator){
            case '+' :
                System.out.println("You are about to add numbers");
                break;
            case '-' :
                System.out.println("You are about to subtract numbers");
                break;
            case '*' :
                System.out.println("You are about to multiply numbers");
                break;
            case '/' :
                System.out.println("You are about to divide numbers");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
