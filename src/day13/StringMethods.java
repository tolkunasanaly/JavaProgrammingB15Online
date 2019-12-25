package day13;

public class StringMethods {
    public static void main(String[] args) {

        //String actions that we already know so far

        //equals
        String s1 = "HEllo";
        System.out.println(s1.equals("abd"));
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        //toUpperCase method of String is used to make String all character uppercase

        System.out.println(        s1      );
        System.out.println(  s1.toUpperCase()      );

        //toLowerCase method of String is used to make String all character lowercase

        System.out.println(  s1.toLowerCase());

        //store your name into a variable
        //print your name in all uppercase
          // you may optionally concatenate "MY NAME IS : YOURNAME"
        //print your name in all lowercase;
           //you may optionally concatenate "my name is : yourname"

        String name = "Tolkun";
        System.out.println("MY NAME IS: " +name.toUpperCase());
        System.out.println("my name is : " +name.toLowerCase());

        //In order to get how many character we have inside String
        //we can use length method of String

        System.out.println(  s1.length()  );

        int lengthOfStr = s1.length();

        if(lengthOfStr > 4){

            System.out.println("More than 4 character");
        }else {
            System.out.println("Not more than 4");
        }


    }
}
