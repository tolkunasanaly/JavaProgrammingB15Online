package day11;

public class StringEqualityPractice_Condition {
    public static void main(String[] args) {

        //create a variable called myStr and assign a value
        //check whether myStr value is Java

        //create a program to check whether myStr value is Java
        //if yes --->> Correct Word!
        //if false --->> Say Java!!!

        String myStr = "tolkun";

        if(myStr.equals("Java")){
            System.out.println("Correct Word");
        }else if (myStr.equals("Cava")){
            System.out.println("Pumpkin");
        }else{
            System.out.println("Not Java Nor Pumpkin");
        }

        //update this program to add more condition
        //using else if in the middle
        /*
        * check the value of myStr
        * if it is Java --->> Correct Word
        * if it is Cava -->>Pumpkin!!
        * else say NOT JAVA NOR PUMPKIN
        * */

    }
}
