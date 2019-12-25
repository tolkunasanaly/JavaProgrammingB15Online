package day26;

import java.util.Arrays;

public class ToCharArrayPracticeWithArrayClassMethod {
    public static void main(String[] args) {

        //2 additional String methods related to array
        //toCharArray(), another is split(bySomething)

        String suvey = "B15 Online 1 Month Surbey";

        char[] surveyChars=suvey.toCharArray();
        System.out.println("BEFORE SURVEY CHAR: " + Arrays.toString(surveyChars));
        Arrays.sort(surveyChars);

        System.out.println("AFTER SURVEYCHAR: "+ Arrays.toString(surveyChars));


    }
}
