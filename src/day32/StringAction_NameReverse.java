package day32;

public class StringAction_NameReverse {
    public static void main(String[] args) {

      //  PrintMyOwnName();
       // String name = "Akbar";
        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Tolkun");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");


    }



    //printStringWithDashInBetween
    //it has one string parameter called name
    //it will do following in method body

    //print each and every character of a String with dash in between
    //excluding the last one Akbar --->> A-k-b-a-r
    //logic:  keep adding (concatenating)  dash after each character and when it comes to last character just don't add it

    public static void printStringWithDashInBetween(String name){

        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
            //if I am not at last index the I print "DASH"
            if (i!=name.length()-1){
                System.out.print("-");
            }
        }
        System.out.println();
    }
//    reversePrintMyOwnName
//* create a method that has no parameter
//    and print your name in reversed order

    public static void PrintMyOwnName() {

        String name = "Tolkun";
        //start from last character and print toward first character

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));

        }
    }
}
