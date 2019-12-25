package repl;
import java.util.*;
public class Time_Seconds_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds= scan.nextInt();
        int  hours, minutes, seconds;
        hours = inputSeconds/3600;
        minutes=(inputSeconds/60)%60;
        seconds=(inputSeconds%360)%60;

        System.out.println(hours+ " hours," + minutes+ " minutes, and " + seconds+ " seconds");


    }
}
