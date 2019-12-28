package repl;

import java.util.*;

public class Repl_Questions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String reversedWord = "";
        int lastCharIndex = word.length() - 1;

        if (word.length() < 5) {
            System.out.println("Too short!");
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        } else {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }
            System.out.println(reversedWord);
        }

    }
}

