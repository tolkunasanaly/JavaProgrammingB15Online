package day26;

public class ArrayTask_NumberTest_Logic1 {
    public static void main(String[] args) {
        //1. given an int array
        // write a program to test all the element in this int array are more than 100

        int[] scores = {156, 101, 76, 187, 87, 110};
        //create a variable called finalResult to store your result
        // of checking if every number in this array is more than 100 or not

        String finalResult = "";  // if all numbers are more than 100 then make it YES, if not make it NO

        //LOGIC 1.2:
        //take each item check if it is less than 100, count
        // in the end if count is more than 0, answer is NO
        int cntMoreThan100 = 0;
        for (int eachNum : scores) {

            if (eachNum > 100) {
                ++cntMoreThan100;
            }
        }

        System.out.println("cntMoreThan100 = " + cntMoreThan100);

        if (cntMoreThan100 == scores.length) {
            finalResult = "YES";
        } else {
            finalResult = "NO";
        }
        System.out.println("Final Result " + finalResult);
        


        String finalResult2="YES";
        
        //LOGIC 2:
        //Check each item and break when number is less than 100 after assigning final result to NO
        


        //LOGIC 3:
        //minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO

    }
}
