package day10;

public class Answer {
    public static void main(String[] args) {

        //create a variable called myAnswer as String
        String myAnswer = "";
        //assign with value of empty string
        //create a variable called myNumber and assign any value
        int myNumber = 15;

        //if the number can be divided by 5 without remainder
        if (myNumber%5 == 0) {
           myAnswer= "Fizz Number";
        }else{
            myAnswer="not a Fizz Number";
        }
        //assign myAnswer value to Fizz Number
        //of not assign the value to not a Fizz Number
        //outside if else statement: print my number is <>, it is <value of myAnswer here>
        System.out.println("print my number is " + myNumber + " , It is " +myAnswer);
    }
}
