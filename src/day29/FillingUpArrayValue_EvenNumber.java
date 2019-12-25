package day29;

import java.util.Arrays;

public class FillingUpArrayValue_EvenNumber {

    public static void main(String[] args) {

        //create an array with size 100 and fill it up as below
        //fill up this array with even number starting from 0

        int [] numbers = new int[100];

        System.out.println(Arrays.toString(numbers));

        //THIS WHAT WE WOULD DO MANUALLY
//        numbers[0]=0;
//        numbers[1]=2;   //1*2
//        numbers[2]=4;  //2*2
//        numbers[3]=6;  //3*2
//        numbers[4]=8;  //4*2
//        numbers[5]=10;  //5*2
//        //.......
//        numbers[99]=198;  // 99*2
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i*2;
        }
        //numbers[x]= x * 2;
        System.out.println("After filling up: \n" +Arrays.toString(numbers));

    }
}
