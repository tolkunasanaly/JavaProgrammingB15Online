package day34;

import java.security.PublicKey;
import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        System.out.println("Method overloading");
        System.out.println(12);
        String name = "Overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1, 4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o", 2));
        System.out.println("=====================");
        //Arrays.toString has 9 different versions to accept different parameter

        //Method overloading:
        // using same name and different parameter for different methods
        //to reuse the name for similar actions
        //IT DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER

        //WE CAN NOT HAVE TWO METHODS WITH SAME METHOD NAME AND SAME METHOD PARAMETERS

        //method name + parameter list == METHOD SIGNATURE

        sayHello();
        sayHello("Universe");
        sayHello("Tolkun");
        System.out.println("===============");
        sayHello(38);
        System.out.println("===============");
        System.out.println( sayHello("Tolkun", "Asanaly"));
    }

    public static void sayHello() {
        System.out.println("Hello, World");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void sayHello(int num) {
        System.out.println("Hello, " + num);
    }
      /* THIS IS REGARDED AS SAME METHOD AS ABOVE METHOD*/
//    public static void sayHello(int x){
//
//    }
    public static String sayHello (String firstName, String lastName){
        return "Hello " + firstName+ " " +lastName;
    }
}