package day14;

public class LastIndexOf {
    public static void main(String[] args) {

        //012345678901
        String name="Game of Java"; // length is 12, last char index is 11

        //find out last location of the letter a shows up
        System.out.println("find out last location of the letter a shows up");
        System.out.println( name.lastIndexOf("a")  );

        //find out last location of character space shows up
        System.out.println("find out last location of character space shows up");
        System.out.println( name.lastIndexOf(" ")  );

        //find out last location of the letter Ga shows up
        System.out.println("find out last location of the letter Ga shows up");
        System.out.println(  name.lastIndexOf("Ga"));

        //find out last location of the letter Kawa shows up
        System.out.println("find out last location of the letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));

        //if I DON'T USE contains method, what would be my condition to check
        //whether we have Kawa in this String, either using indexOf or lastIndex




    }
}
