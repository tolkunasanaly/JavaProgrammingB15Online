package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        //from 1 to 100 print out all the numbers that can be divided by 15 without remainder

        //from 1-100 count how many numbers can be divided by 15
        int counter = 0; // i want to initialized

        for (int x = 1; x <= 100; x++) {
            if (x % 15 == 0) {
                System.out.println(x);
                //counter = counter +1;
                //counter  +=1;
                ++counter;
            }

        }
        System.out.println("counter = " + counter);

        /// given a string with value
        //find out how many a showed up in this String

        String name= "Esra Fidan";

       // System.out.println(name.charAt(0)=='a');

        int countOfA = 0;

        for (int x = 0; x < name.length(); x++) {

            System.out.println(name.charAt(x));

            if(name.charAt(x)=='a' ){
                System.out.println("BINGO");
                ++countOfA;
            }


        }
    }

}
