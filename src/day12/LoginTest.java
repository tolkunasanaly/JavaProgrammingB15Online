package day12;

public class LoginTest {
    public static void main(String[] args) {

        //create two string variables called userName, password
        String userName ="u3ser123";
        String password = "pa2s123";
        // and do following:
        //your correct username password is user123 and pass123
        //
        //Check if your username and password correct
        //if so print login successful
        if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login Successful");
        }else if(!userName.equals("user123") && password.equals("pass123")){
            System.out.println("USer name is not correct");
        }else if (userName.equals("user123") && !password.equals("pass123")){
            System.out.println("Password is not correct");
        }else {
            System.out.println("Username and Password are both Wrong");
        }

        //if not
        // Check whether your username correct
        //if not print, username is not correct
        //check your password is correct or not
        //if not print password is not correct
    }
}
