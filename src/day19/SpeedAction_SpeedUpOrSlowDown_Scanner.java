package day19;

import java.util.Scanner;

public class SpeedAction_SpeedUpOrSlowDown_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting speed and ending speed ");

        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start < end) {
            System.out.print("INCREASING SPEED");
            // i will increase the speed till i reach ending speed
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }
        }else if (start>end){
            System.out.print("INCREASING SPEED");
            //i will decrease the speed till i reach ending speed
            for (int x=start; x>end; x--){
                System.out.println(x+",");
            }

        }else{
            System.out.println("No Action Needed!!! Same Speed!");
        }
    }
}