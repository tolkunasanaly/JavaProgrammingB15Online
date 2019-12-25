package day25;
import java.util.*;
public class StringToCHarArrayMethod {
    public static void main(String[] args) {

        String name="Alesya";

        //how would you store each and every character
        //to an char array from above name
        //without using method we are about to learn

        char []namesChar = new char[6];

//        namesChar[0]=name.charAt(0);
//        namesChar[1]=name.charAt(1);
//        namesChar[2]=name.charAt(2);
//        namesChar[3]=name.charAt(3);
//        namesChar[4]=name.charAt(4);
//        namesChar[5]=name.charAt(5);

        for (int x = 0; x <namesChar.length ; x++) {

            //take each character of name and fill the char array values

            namesChar[x]=name.charAt(x);

        }
        System.out.println("namesChar = " + Arrays.toString(namesChar));


        char[] namesChars2= name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString(namesChars2));

        //pick up your own name and turn in into char array and use for each loop to loop over them

        String name2= "Tolkun";
        char []namesChar2 = name2.toCharArray();
        System.out.println("namesChar2 = " + Arrays.toString(namesChar2));

    }
}
