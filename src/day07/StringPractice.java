package day07;


public class StringPractice {

    public static void main(String[] args) {

        String firstName = "Tolkun";
        String lastName = "Asanaly";
        String companyName = "MAH";
        String email = firstName+"_"+lastName+"@"+companyName+".com";

        System.out.println("My name is " + firstName + " " +lastName + ", and I work for the "
                + companyName + " and my email is " + email);
    }
}
