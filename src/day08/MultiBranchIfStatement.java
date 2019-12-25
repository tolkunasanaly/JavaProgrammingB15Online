package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //Pseudo code:
        /*
        *given your currentSpeed, speedLimit
        *
        * check whether the current speed more than 90 ---->> jail
        *
        *                                 more than 80 and less than 90 ------->> reckless driving
        *
        *       ---------------start from here
        *            more than 70  ------>> point taken
        *
        *            more than 60 and less than 70 ------->> warning
        *
        *
        *         if not speeding keep driving
        *
         */
          int currentSpeed =45;

          if(currentSpeed>60){
              System.out.println("You are speeding more than 70 --- Points taken!");
              //asking whether its less than or equal 70 and more than 60

              // when you come to this point, your speed is already not more than 70
          }else if(currentSpeed>70){
              System.out.println("Your speed is less than or equal 70 but more than 60");
          } else{
              System.out.println("Keep driving, you are good");
          }
    }

}
