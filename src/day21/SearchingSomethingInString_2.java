package day21;

public class SearchingSomethingInString_2 {
    public static void main(String[] args) {
                    //   0123456789
        String myName = "Daria Ozer";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        //find out index of all the word an  a in cases insensitive manner
        //I will go through each and every letter of the String by 2 char
        //                  -----> each character I can use substring(0,2) and so on
        //                  ----->> going to 0 to one character before last char index ---->>> for loop

        //while i am going through each and every 2 character
            // i will check whether current character i am looking at
           //equals  to <an> in case sensitive --->>>> currentCharacter.equalsIgnoreCase("a")
          //if it is I will print the index    printLn (the variable you use to keep the index)
           // if not --->> just move on
          // perform this action until I reach one character before last character
        // because last chance to get 2 characters is ===>>>> righ

        System.out.println("---2 char ---");
        //for (int x = 0; x < charCount ; x++) {
        for (int x = 0; x <= lastCharIndex; x++) {


           String currentChar = myName.substring(x, x+2);

           if (currentChar.equalsIgnoreCase("an")){

               System.out.println("The index of an " + x);
           }
    }
}}
