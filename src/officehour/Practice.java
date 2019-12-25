package officehour;

public class Practice {
    public static void main(String[] args) {
                   // 012345678901234567890123456
        String item ="Echo Dot (3rd Gen) Charcoal";
        //get whatever is inside parenthesis()

        //find out index of (and index of), use them for substring to get the text

        System.out.println(item.substring(9,18));
        System.out.println(item.substring(10,17));


        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");

        String wordInsideParenthesis =
                item.substring(indexOfOpeningParenthesis+1, indexOfEndingParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);
        //---------------------------------------

        String letters = "J%a^V*****$a";
        System.out.println("Letter before = "+letters);
        //REQUIREMENT remove % ^ * $

        letters=letters.replace("%", "")
                       .replace("^","")
                       .replace("*","")
                       .replace("$","")
                       .toUpperCase(); //"JAVA"
        System.out.println("letters = " +letters);




    }
}
