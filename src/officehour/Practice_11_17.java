package officehour;

public class Practice_11_17 {
    public static void main(String[] args) {
/*
* equals
equalsIgnoreCase
length
toUpperCase
toLowerCase
startWith
endWith
charAt
contains
indexOf
lastIndexOf
* isEmpty
trim
* */
        String message = "   I LOVE JAVA    ";
        //trim -->>take out spaces at beginning and ending of a String object
        //IT DOES NOT TAKE OUT THE SPACE IN BETWEEN CHARACTERS!!!!!!!!

        System.out.println("message = <" + message+">");

        String messageTrimmed =message.trim();
        System.out.println("message = <" + messageTrimmed+">");
        
        //isEmpty --->> Check whether a String object is empty, meaning there is nothing inside ""
        //isEmpty = yourString.length() == 0 ---->>> true
        
        String emptySpaces="       ";
        System.out.println("emptySpaces = <" + emptySpaces+">");
        
        String emptySpacesAfterTrimmed= emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed.length is: " + emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is empty??: " + emptySpacesAfterTrimmed.isEmpty());


    }
}
