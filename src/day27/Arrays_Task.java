package day27;

public class Arrays_Task {
    public static void main(String[] args) {

        /*
        /* TASK 2
         write the program that can find the minimum number
          from int array without using SORT method
         */
        int[] scores = {100, -99, -1000, 2000, 5000, 1, 2, 3, 4, 1231};
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        System.out.println("min number = " + min);

        //TASK
        //write a program that can fine the second minimum number for an array
        // DO NOT USE sort method

        int secondMin = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == min) {
                continue;
            }
            if (secondMin > scores[i]) {
                secondMin = scores[i];
            }
        }
        System.out.println("second Min number = " + secondMin);

        //TASK
        //write a program that can fine the third minimum number for an array
        // DO NOT USE sort method

        int thirdMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == min || scores[i] == secondMin) {
                continue;
            }
            if (thirdMin > scores[i]) {
                thirdMin = scores[i];
            }
        }
        System.out.println("third Min number = " + thirdMin);
    }
}