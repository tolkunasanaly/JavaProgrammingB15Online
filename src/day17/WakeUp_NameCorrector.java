package day17;

public class WakeUp_NameCorrector {
    public static void main(String[] args) {
       /* WAKE UP TASK 1 :
        create a class called WakeUp_NameCorrector with main
                Create a String variable to store your name in any case combination
        for example  jon jOn jON  any of them :
        Create a variable called name2
        make your first letter uppercase then rest lowercase
        jon  ---> Jon    arya -->> Arya
        Optionally ask your name from Scanner
        Optionally ask your full name
                -->> then make your full name first letter uppercase the rest lowercase */
            //       01234567
       String name ="kHumAyRa";

       //Substring method --->>>get the part of String inside another String
        //it has 2 versions:
           //1 - start with certain index and end at ending index
          //2 - start with certain index then get the rest of the String


       //get the first character --->> make it uppercase
        //get the rest of the characters starting from 2nd character
        //then make it lowercase
        //eventually concatenate them

//        String nameFixed= (name.charAt(0)+"").toUpperCase();
////        nameFixed=nameFixed+name.substring(1).toLowerCase();

        String nameFixed= name.toUpperCase().substring(0, 1);
               nameFixed+=name.substring(1).toLowerCase();

        System.out.println("name Fixed = " + nameFixed);

        //make whole name uppercase then get the first character
        //get the rest of the characters starting from 2nd character
        //then make it lowercase
        //eventually concatenate them

    }
}
