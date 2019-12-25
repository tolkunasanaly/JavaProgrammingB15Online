package day25;

import java.util.Arrays;

public class STringToCharArray {
    public static void main(String[] args) {
        //pick up your own name and turn in into char array and use for each loop to loop over them

        String name= "Tolkun";

        //turn this into charArray using tocharArray() method of String
        //WHAT DOES IT DO?
        //toCharArray90 is a method of String that turn string into char array

        //DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD?
        //NO

        //WHAT DO I GET OUT OF IT?
        // char array object that has all the characters of the String object

        char []allCharsInName = name.toCharArray();

        for (char eachChar:allCharsInName) {
            System.out.println("eachChar= " + eachChar);

        }
       //now count how many a we have

        int count =0;
        for (char eachChar: allCharsInName ) {

            if (eachChar=='a'){
                ++count;
            }

        }
        System.out.println("count " + count);

        //What if you want to sort all characters of your name
        //in alphabetical order?

        Arrays.sort(allCharsInName);
        System.out.println("AFTER SORTING = " + Arrays.toString(allCharsInName));


    }
}
