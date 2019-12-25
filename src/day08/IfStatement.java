package day08;

public class IfStatement {
    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentSpeed = 100;

        //if the yourCurrentSpeed is more than speed limit
        //get pulled over by the police
        //given ticket by the police
        //taken away some points on your license
        //go to court

        boolean IamSpeeding = yourCurrentSpeed > speedLimit;

        //INSIDE PARENTHESIS WE CAN ONLY PUT
        //BOOLEAN VALUE
        //BOOLEAN VARIABLE
        //ANY EXPRESSION THAT RETURN BOOLEAN VALUE

      //  if (IamSpeeding){
        //if (true){
        if(yourCurrentSpeed>speedLimit){

            System.out.println("Get pulled over by the police");
            System.out.println("Given ticket by the police");
            System.out.println("Taken away some points on your license");
            System.out.println("Go to court");
        } else {
            System.out.println("Go shopping");
            System.out.println("Buy ice cream");
            System.out.println("Enjoy your day");
        }
        System.out.println("The End");



        //if not over the limit
        // go shopping!!

        // outside if statement, say The end

    }
}
