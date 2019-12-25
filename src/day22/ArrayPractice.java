package day22;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        double[] prices =new double[5];

        System.out.println(prices[0]);

        //can not print out array variable directly
        //to see what's inside

        System.out.println(prices);

        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        //create a char array that hold all the letters from your first name
        //and assign values using each characters of your first name

        //then print out each character

        char [] firstName = new char[6];
        // WHAT DEFAULT VALUE DO WE GET FOR CHAR ARRAY
        //WE GET A CHAR REPRESENTED BY ASCII CODE



        firstName[0]='T';
        firstName[1]='o';
        firstName[2]='l';
        firstName[3]='k';
        firstName[4]='u';
        firstName[5]='n';

        System.out.println(firstName[0]);
        System.out.println(firstName[1]);
        System.out.println(firstName[2]);
        System.out.println(firstName[3]);
        System.out.println(firstName[4]);
        System.out.println(firstName[5]);
        //THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        //AND THIS IS ONLY FOR CHAR ARRAY, ANYTHING ELSE WILL PRINT MEMORY ADDRESS
       //---->>>> System.out.println( firstName);

        boolean[] yesNo=new boolean[3];

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0]=true;
        yesNo[1]=false;
        yesNo[2]=7>8;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);




    }
}
