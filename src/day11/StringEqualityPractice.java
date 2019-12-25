package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        //checking for String equality should be always done by using equals method of the String

        //oneString.equals(anotherString) --->> true or false
        //equals method coming from String class
        //each and every String object you created will have this functionality

        //just comparing 2 String Literal directly using equals method
        // this is something that you will rarely use
        //System.out.println("Java".equals("java"));

        String myStr ="Java";

        System.out.println(myStr.equals("Java"));

        String yourStr =new String( "Java");

        System.out.println("is my string same as your string?");
        //how to compare myStr to yourStr for equality

        System.out.println(myStr.equals(yourStr));


        //create a program to check whether myStr value is Java
        //if yes --->> Correct Word!
        //if false --->> Say Java!!!

        if (myStr.equals("Java")){
            System.out.println("Correct Word!!!");
        }else{
            System.out.println("Say Java");
        }

    }
}
