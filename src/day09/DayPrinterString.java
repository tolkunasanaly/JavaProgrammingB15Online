package day09;

import jdk.swing.interop.SwingInterOpUtils;

public class DayPrinterString {
    public static void main(String[] args) {
        /*
        * if the daycode is 1 --->> Monday
        * if the daycode is 2 --->> Tuesday
        * if the daycode is 3 --->> Wednesday
        * if the daycode is 4 --->> Thursday
        * if the daycode is 5 --->> Friday
        * if the daycode is 6 --->> Saturday
        * if the daycode is 7 --->> Sunday
        * if none of the above just print unknown day
        * */
        int dayCode =7;
        String dayName = ""; //ASSIGNING AN EMPTY STRING VALUE


        if (dayCode==1) {
            dayName = "Monday";
        } else if (dayCode==2){
            dayName = "Tuesday";
        }else if (dayCode==3) {
            dayName = "Wednesday";
        }else if (dayCode==4) {
            dayName = "Thursday";
        }else if (dayCode==5) {
            dayName = "Friday";
        }else if (dayCode==6) {
            dayName = "Saturday";
        }else if (dayCode==7) {
            dayName = "Sunday";
            System.out.println("Yay!!!SUNDAY!!!");
        }
        else {
            dayName = "UNKNOWN";
        }
        System.out.println("Day  is " + dayName);
    }
}
