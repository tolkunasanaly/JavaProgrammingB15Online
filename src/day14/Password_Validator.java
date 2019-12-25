package day14;

public class Password_Validator {
    public static void main(String[] args) {
        //PASSWORD VALIDATOR

        //minimum 8 char and 16 char
        //it must contain _ or $
        //it must not contain space
        //it must start with Ab

        //if any of above conditions does not match say INVALID PASSWORD
        //else say GOOD PASSWORD

        String password = "Abasanaly_$";
        //minimum 8 char and 16 char
        boolean min8max16 = password.length() >= 8 && password.length() <= 16;

        //it must contain _ or $
        boolean mustContains_or$ = password.contains("$") || password.contains("_");

        //it must not contain space
        boolean mustNotContainsSPace = !password.contains(" ");

        //it must start with Ab
        boolean mustStartWithAb = password.startsWith("Ab");

        if (min8max16 && mustContains_or$ && mustNotContainsSPace && mustStartWithAb) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSWORD");
        }

    }
}