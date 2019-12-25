package day17;

import java.util.Scanner;

public class ReversedName_WhileLoop {
    public static void main(String[] args) {

        //assume that you don't know the length of your name
        //write a program to print your name in reverse order

        //find out the location of your character of your name
        //pick your last character of your name according to the location
        //then keep shifting the location to pick until first character
                    // 012345  index  = count -1
//        String name = "Tolkun";
//                  //   123456  count = name.length()
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name =scan.nextLine();

        int x =name.length()-1;

        while (x>=0){

            System.out.println("index " + x + " : " +name.charAt(x));
            --x;
        }
    }
}
