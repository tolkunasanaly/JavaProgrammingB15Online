package day20;

public class FindDogInASentence {
    public static void main(String[] args) {

        //given sentence, find out the location of the dog
        //our approach is
        //going thru the sentence 3 characters at a time
        //then if 3 characters happen to be a dog, we print out the index
          /*
I L
 Li
Lik
ike
ke
e D
 Do
Dog
og
g ,
 ,
, D
 Do
Dog
ogs
gs
s a
 ar
are
re
e c
 cu
cut
ute
te
e ,
 ,
, D
 Do
Dog
ogs
gs
s a
 ar
are
re
e f
 fr
fri
rie
ien
end
ndl
dly
          * */


        String msg = "I like Dog , Dogs are cute , Dogs are friendly";
        int lastCharIndex = msg.length() - 1;

        for (int x = 0; x <= lastCharIndex - 2; x++) {

            String current3chars = msg.substring(x, x + 3);

            //System.out.println(x + " :  " +  current3chars   );

            if (current3chars.equals("Dog")) {
                System.out.println("BINGO !!!! AT " + x);
            }

        }




    }
}
