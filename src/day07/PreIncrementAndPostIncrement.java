package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

//        int score = 10 ;
//        Increment and decrement operator ++  --  has two version
//        Pre-increment   ++score
//        Post increment  score++

        //int apple =8;

       // apple++;   // -----> 9 apples

      //  System.out.println(apple); // ------> 9 apples   printing the increased value
       // System.out.println(++apple); // -------> 9 apples   increasing the value and print the value

        //apple++, when ++ comes after the variables
        //it's called post increment
        //it will increase the value
        //BUT it will reflect the increased the value next time the variable show up!!!
       // System.out.println(apple++);

      //  System.out.println(apple);

        int score = 50;
        System.out.println(++score); // 51

        System.out.println(score++); // 51 and ready to be 52 next time when it shows up
        System.out.println(score); // 52

        System.out.println(--score); //51
        System.out.println(score--); // 51 but ready to be 50 next time when it shows up
        System.out.println(score);//50

    }
}
