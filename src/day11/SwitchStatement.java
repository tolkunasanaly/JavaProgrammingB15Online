package day11;

public class SwitchStatement {

    public static void main(String[] args) {
        String targetOption = "kk";

        /*Create class called WarmUp1_LightOnOff
Create a variable  targetOption as String and assign one of below options  for example bd
You have 4 switches in your home to turn on
	  Bd — bedroom
      Lr  — living room
	  ki  — kitchen
      Ha— Hallway
Use switch statement to write a program to print which room light is turned on
For example if Bd was targetOption
	then print  you have turned on bedroom light */
        switch (targetOption){
            case "bd" :
                System.out.println("You have turned on bedroom light");
                break; // if break does not show up here
            //it will just move on to next case
            case "lr" :
                System.out.println("You have turned on living room light");
                break;
            case "ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "ha" :
                System.out.println("You have turned on hallway light");
                break;
            default:
                System.out.println("Seems that Switch is not working!");

                break;

    }
}}
