package day31;

public class MethodPractice_2 {

    //write piece of reusable code to count from 1 to 10
    //give a name count1to10                                  : method name
    //no need for object when being called                   :static
    //it should be accessible anywhere in your project       :public
    //it does not return any value                           :void
    // does not need any external data when being called
    public static void main(String[] args) {

        count1to10();
        count1to10();
        countDownFrom20();
        printOddNumbers1to100();
        spellName();

    }
    //does not matter where you put the method
    //as long as it's inside the class{}
    //and outside any of the method

    public static void count1to10() {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Create a method called countDownFrom20

    public static void countDownFrom20() {
        for (int i = 20; i >= 1; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void printOddNumbers1to100() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void spellName() {
        String name = "Seda";

        for (int i = 0; i <name.length() ; i++) {
            if(i == name.length()-1){
                System.out.println(name.charAt(i));
            }else{
                System.out.print(name.charAt(i)+"-");
            }
        }
    }
}
