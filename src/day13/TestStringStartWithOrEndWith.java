package day13;

import jdk.swing.interop.SwingInterOpUtils;

public class TestStringStartWithOrEndWith {

    public static void main(String[] args) {

        String name = "Muge";

        //check whether if String start with another string
        //CASE SENSITIVE

        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("mu"));

        System.out.println(name.startsWith("Mac"));

        //check if a string end with another string
        System.out.println(name.endsWith("ge"));
        System.out.println(name.endsWith("kee"));

    }
}
