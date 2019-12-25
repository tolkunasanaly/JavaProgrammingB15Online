package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

//        char grade = 'B';
//
//        System.out.println(grade);


        // "B" is represented by 66 in ASCII table
        //here type char is automatically widened to int
        //and stored as number
       // int letterInNumber = 'B';
      //  System.out.println(letterInNumber);

      //  int letterInNumber2 ='b';
       // System.out.println(letterInNumber2);

        //------------------------
       // char myFirstChar = (char) 100;
       // System.out.println(myFirstChar);

        int myNameNum1 = 'T';
        int myNameNum2 = 'O';
        int myNameNum3 = 'L';
        int myNameNum4 = 'K';
        int myNameNum5 = 'U';
        int myNameNum6 = 'N';

        System.out.println(myNameNum1);
        System.out.println(myNameNum2);
        System.out.println(myNameNum3);
        System.out.println(myNameNum4);
        System.out.println(myNameNum5);
        System.out.println(myNameNum6);


        char letterA = 'a';
        // adding a character to a int number will result in int
        //(int) letterA + 1 --------------97 + 1
        System.out.println(letterA +1); // ---------98

        System.out.println(" " + letterA +1);


    }
}
