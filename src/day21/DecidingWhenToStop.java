package day21;

public class DecidingWhenToStop {
    public static void main(String[] args) {

        String msg ="Hello World";

        int charCount =msg.length();

      //  int countOfCharToIterate= 4;
        int n= 7;
        for (int x = 0; x<=charCount-7; x++){
            System.out.println(msg.substring(x,x+n));
            /*
            *   Hell
                ello
                llo
                lo W
                o Wo
                Wor
                Worl
                orld
                * */
        }
    }
}
