package day12;
public class CheckingMyNameCaseSensitive {
    public static void main(String[] args) {

        String myName="Tolkun" ;
        boolean correctName = myName.equals("tolkun");

        System.out.println(correctName);

        boolean correctName2 =myName.equalsIgnoreCase("Tolkun");
        System.out.println(correctName2);

        String name ="Emre";

        //I want to store the result of checking name into a variable
        boolean nameEqualsWithoutCase =name.equalsIgnoreCase("emre");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);
        //here directly printing without saving into variable

                          //This will eventually become true or false
        System.out.println(name.equalsIgnoreCase("eMrE"));
        System.out.println(name.equalsIgnoreCase("abc"));
    }
}
