package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {

        String students = "Abbos, Zulyar, Zhibek, Hasan, Muge, Orhan, Susan";
        students = students.replace(" ", "");
        System.out.println("students = " + students);
        // first get all the name into String array called namesArray
        String[] namesArray = students.split(",");
        System.out.println(Arrays.toString(namesArray));
        System.out.println("Length of namesArray1 is " + namesArray.length);
        int studentCount = namesArray.length;

        for (int x = 0; x < studentCount; x++) {

            String name = namesArray[x]; // Abbos // A-b-b-o-s-
            System.out.println("Spelling = " + name);

            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i) + "-");
            }
            System.out.println();

        }


//        String name1 = namesArray[1]; // Zulyar
//        for (int i = 0; i < name1.length(); i++) {
//            System.out.print(name1.charAt(i) + "-");
//        }
//        System.out.println();
//
//        String name2 = namesArray[2]; // Zhibek
//        for (int i = 0; i < name2.length(); i++) {
//            System.out.print(name2.charAt(i) + "-");
//
//
//            //Spell the name of each person in this format
//            //A-b-b-o-s-.....
//            //Z-u-l-y-a-r-........
//

    }
}
