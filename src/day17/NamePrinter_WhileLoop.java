package day17;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {

        String name = "Cybertek School Java Program";

        //get each and every character and print them out vertically

        int x=0;

           //in order to print each character of a String
          //we need to start getting character
         //from index 0 till last index (name.length()-1)

        while (x < name.length()) {   // (x <=name.length()-1)

            System.out.print("Index " + x+ ": ");
            System.out.println(name.charAt(x));
            ++x;
        }

        //assume that you don't know the length of your name
        //write a program to print your name in reverse order




    }
}
