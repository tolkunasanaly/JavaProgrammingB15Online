package day16;

public class WarUp_ReverseWord_Akbar_Version {
    public static void main(String[] args) {

        /*WAKE UP Task 1 :
Given a word with 4 characters
stored in a String variable word1
create a String variable called word2
store the reversed word1 into word 2
and print out
FOR EXAMPLE :
word1 ==> Java    -->> word2 avaJ
-- optionally ask this word from scanner
*/
        String word1 = "Java";
        String word2 = "";
        //in order to reverse a word, we need to take last character and put in first character
        //then put the second character from last location till first location then save it
        
        //word2 = ""+ word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
      //  word2 = word2 + word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
      //  word2 += word1.charAt(3)+""+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        //extra way to do this

        System.out.println("word2 = " + word2);




    }
}
