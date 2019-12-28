package day34;

public class LoginActivity {
    public static void main(String[] args) {
        loginVoid("user", "abc123");


        boolean result = loginReturn("user", "abc123");
        System.out.println("result = " + result);

        System.out.println("second run " + loginReturn("aaaa", "kdsods"));

       // System.out.println(   loginVoid("aaaa", "kdsods")  ); CAN NOT DO IT WITH VOID METHOD

        //boolean result2= loginVoid("abc", "dfis")

    }


    public static void loginVoid(String username, String password) {

        if (username.equalsIgnoreCase("user") && password.equalsIgnoreCase("abc123")) {
            System.out.println("Successful");
        } else {
            System.out.println("Failed");
        }


    }

    public static boolean loginReturn(String user, String password) {

        return user.equalsIgnoreCase("user") && password.equalsIgnoreCase("abc123");

    }//        if(user.equalsIgnoreCase("user")&&password.equalsIgnoreCase("abc123")){
//            return true;
//        }else{
//            return false;
//        }


    /**
     * 1, login1 :  static void method
     * 	it has two String method paramters
     * 			called username and password
     * 	(it accept 2 String object as argument when being called)
     * 	it check whether username and password  "user" and "abc123"
     * 	if yes
     * 		print login successful
     * 	else
     * 		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)
     */
    /**
     * 2, login2 :  static method boolean return type
     * 	it has two String method paramters
     * 			called username and password
     * 	(it accept 2 String object as argument when being called)
     * 	it check whether username and password  "user" and "abc123"
     * 	if yes
     * 		return true
     * 	else
     * 		return false
     */
}
