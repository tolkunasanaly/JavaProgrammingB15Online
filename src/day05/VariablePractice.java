package day05;

import java.util.function.DoubleToIntFunction;

public class VariablePractice {

    public static void main(String[] args) {

        //8 primitive data type
      /*

      whole numbers: byte, short, int, long
      fraction numbers: float, double
      logical : boolean (true, false)
      character: char (single character in single code)

      usually by default for whole numbers: just use int
      usually by default for fractional numbers: just use double

      IS STRING part of Primitive type? : NOOOOO!!!!!!
      STRING is sequence of character
    */
      //Task 1: Age calculator
        //given birth year, please calculate the age

//        int birthYear = 2001;
//        int currentYear = 2019;
//        int age = currentYear-birthYear;

        //I was born in year 2001, and I am 18 years old
        //System.out.println("I was born in year " + 2001 + " and I am" + (2019-2001) + " years old");
        //System.out.println("I was born in year " + birthYear + " and I am " + age + " years old");

        //Task 2
        //you are speeding today
        //speed limit is number, and your current speed is this
        //generate this output of: You are driving 10 mph more than speed limit
        int currentSpeed = 90;
        int speedLimit = 50;
        int overTheLimit = currentSpeed-speedLimit;
        System.out.println("Your speed is: " + currentSpeed +" mph and you are driving " + overTheLimit + " mph more than speed limit!");


    }

}
