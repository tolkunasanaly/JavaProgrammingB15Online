package day12;

public class InterviewQuestion {
    public static void main(String[] args) {


        /*
        * Given a number, create a variable int num
        * if this number can be divided by 5 without remainder let's print it Fuzz number
        * For example:
        * 5,15,25,100
        * if this number can be divided by 3 without remainder let's print it Buzz number
        * For example:
        * 3,15,9,27
        * if this number can be divided by both 3 and 5 let's print FizzBuzz Number
        * For example:
        * 15,45,30,90
        *
        * */
        int num =9;
        if(num%5 ==0 && num%3==0){
            System.out.println("FuzBuzz number");
        }else if(num%5==0){
            System.out.println("Fuzz number");
        }else if(num%3==0){
            System.out.println("Buzz number");
        }

    }
}
