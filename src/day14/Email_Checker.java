package day14;

public class Email_Checker {
    public static void main(String[] args) {
        //create a variable called email
        String email = "tolkusha@gmail.com";
        //check for below condition:
        //if it does not contain character @ say INVALID EMAIL    //if it contains space say INVALID EMAIL
        boolean noChar_NoSpace = !email.contains("@") || email.contains(" ");
         //boolean containsSpace = email.contains(" ");
        //if it endsWith @gmail.com --->> gmail
        boolean endsWithGmail = email.endsWith("@gmail.com");
        //if it endsWith @yahoo.com --->> yahoo mail
        boolean endsWithYahoo = email.endsWith("@yahoo.com");
        //it it endsWith @mail.ru --->> russian email
        boolean endsWithMail = email.endsWith("@mail.ru");

        if (noChar_NoSpace) {
            System.out.println("INVALID EMAIL");
        } else if (endsWithGmail) {
            System.out.println("GMAIL");
        } else if (endsWithYahoo) {
            System.out.println("YAHOO");
        } else if (endsWithMail) {
            System.out.println("MAIL");
        }
    }
}
