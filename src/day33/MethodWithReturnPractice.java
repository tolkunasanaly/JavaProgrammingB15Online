package day33;

public class MethodWithReturnPractice {
    public static void main(String[] args) {

        System.out.println(getSumFrom1ToX(6));
        System.out.println("=================");
        System.out.println(build_GOT_Email("Arya", "Stark"));
        System.out.println(build_GOT_Email("Tolkun", "Asanaly"));

        //you are given a variable fullName that has first name and last name
        //use this full name to generate GOT_Email

        String fullName="Tolkun Asanaly";

//        String part1= fullName.split(" ")[0];
//        String part2= fullName.split(" ")[1];

        //store this resulting email
//        String herEmail= build_GOT_Email(part1,part2);
//

        String [] fullNameSplit= fullName.split(" ");
        String herEmail = build_GOT_Email( fullNameSplit[0], fullNameSplit[1]);

        System.out.println("herEmail = " + herEmail);


//        String firstName="Jon";
//        String lastName="Snow";
//  /* @return the email created using
//                * firstName initial+lastname+@NightWatch.com   */
//
//        String email = firstName.charAt(0)+ lastName+"@.NightWatch.com";
//        System.out.println(email);
    }

    /*TASK
      getSumFrom1ToX
      this method should calculate the sum of
     * the numbers from 1 to the number user passed, including the number itself
     * @param x final number to be added
     * @return the sum of numbers from 1 to X as int
     * */

    /**
     * build_GOT_Email
     * This method should build email using user's first and last name
     * for example Jon Snow --->> JSnow@NightWatch.com
     *
     * @param firstName user's first name
     * @param lastName  user's last name
     * @return the email created using
     * firstName initial+lastname+@NightWatch.com
     */
    public static String build_GOT_Email(String firstName, String lastName){
        String email = firstName.charAt(0)+ lastName+"@.NightWatch.com";

        return email;
    }



    public static int getSumFrom1ToX(int x) {

        int sum = 0;

        //TODO: YOUR CODE GOES HERE

        for (int i = 1; i <= x; i++) {
            sum += i;  // sum= sum + i;
        }

        return sum;
    }
}