package day09;

public class EvenAndOdd {
    public static void main(String[] args) {

//        // Task 1
//        Create a class called EvenOddFinder with main method
//       Write a program to find out a number is even or odd
//       Create a int variable called myNumber and assign a value
//
//        If the number is even then says  this is a even number
//        If the number is odd then says  this is a odd number

        int myNumber = 23;

        if (myNumber % 2 == 0)
        {
            System.out.println("This is an even number");
        }
        else{
            System.out.println("This is an odd number");
        }
        System.out.println("END");
    }
}
