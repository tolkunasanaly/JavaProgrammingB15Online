package day29;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FillUpStringArray {
    public static void main(String[] args) {

       // Create an array with size 300 and fill it up with I Love Java

        String [] strArr= new String[300];

//        strArr[0]="I Love Java";
//        strArr[1]="I Love Java";
//        strArr[2]="I Love Java";
//
//        strArr[0]="1.I Love Java";
//        strArr[1]="2.I Love Java";
//        strArr[2]="3.I Love Java";

        for (int i = 0; i <strArr.length ; i++) {
            //strArr[i]=i"I Love Java";
            strArr[i]=(i+1)+ ".I Love Java";
        }
        System.out.println("strArr = " + Arrays.toString(strArr));

        String str   = new String("ABC"); //THIS IS STRING OBJECT WITH VALUE ABC
        String [] strArr2= new String[5]; // EMPTY STRING ARRAY WITH CAPACITY 5
        strArr2[0]= "I Love Java";
        strArr2[1]= "I Love Java";
        strArr2[2]= "I Love Java";
        strArr2[3]= "I Love Java";
        strArr2[4]= "I Love Java";
        System.out.println("strArr2 = " + Arrays.toString(strArr2));
    }
}
