package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        //each character has it's corresponding ascii value
        //from ascii table

        //int x ='A';
        char myChar ='A';

        System.out.println(myChar);
       //'A' +1 ---->>>65 + 1 =66 ---->>>>66 -->>'B'  (myChar data type is char)
        System.out.println(++myChar);
        //'B' +1 ---->>>66 + 1 =67 ---->>>>66 -->>'C'  (myChar data type is char)
        System.out.println(++myChar);
        //'C' +1 ---->>>67 + 1 =68 ---->>>>66 -->>'D'  (myChar data type is char)
        System.out.println(++myChar);
        //'D' +1 ---->>>68 + 1 =69 ---->>>>66 -->>'E'  (myChar data type is char)
        System.out.println(++myChar);



        for(char iChar ='A'; iChar<='Z'; iChar++){

            System.out.print( iChar + " ");
        }
        System.out.println();

        for (char kChar ='Z' ; kChar>='A'; kChar--){
            System.out.print(kChar+" ");
        }

        //HOMEWORK
        //CREATE AN INTERACTIVE PROGRAM TO ASK USER
        //STARTING CHARACTER AND ENDING CHARACTER
        //THEN PRINT EVERYTHING IN BETWEEN
        //IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        //FOR EXAMPLE USER CAN ENTER Z A, OR A K
        //Can we ask user to enter a character? NO!!!!
        //Ask user for String and pick first character by charAt(0)





        String line = "";

        for (char iChar ='A'; iChar<='Z'; iChar++){

        }


    }
}
