package day35;

import day12.CheckingMyNameCaseSensitive;

import javax.print.DocFlavor;

public class CharacterPractice_2 {
    public static void main(String[] args) {
        
        
        char myChar = '7';
        // get int 7
        
        int myNum = Integer.parseInt(myChar+"");
        System.out.println("myNum = " + myNum);

       // Character.toString(myChar);
        
        //String.valueOf(myChar);              // turning character to string

        String str = "A34B123C4X";

        //for each char in string check if it is number
        //if yes store in a String and use that string to get Integer
        //then sum it up

        char[] allChar = str.toCharArray();

        int sum = 0;

        for (char eachChar : allChar) {
            //checking whether each char is a number or not
            if (Character.isDigit(eachChar)) {
                // if it is print out to see
                System.out.println("each Char = " + eachChar);
                //then turn it into int using parseInt method
                //parseInt only accept String
                //so we need to pass String by adding "" to each
                int eachNum = Integer.parseInt(eachChar+"");
                //now we can numerically add the number of sum
                sum = sum+ eachNum;
                
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("sum = " + sum);
        // for loop version
        int sumForLoop = 0;
        for (int x = 0; x < str.length(); x++) {
            //isDigit accept char  // each char
            if (Character.isDigit(str.charAt(x))) {
                // appending number character to the result numsInStr
                sumForLoop += Integer.parseInt(str.charAt(x) + "");
            }

        }
        System.out.println("sumForLoop = " + sumForLoop);
    }
}