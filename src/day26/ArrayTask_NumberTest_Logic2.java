package day26;

public class ArrayTask_NumberTest_Logic2 {
    public static void main(String[] args) {

        //LOGIC 2:
        //Check each item and break when number is less than 100 after assigning final result to NO

        int[] scores = {156, 101, 76, 187, 87, 110};
        int size = scores.length;
        System.out.println("size = " + size);

        String finalResult = "YES";

        for (int eachNum : scores) {

            if (eachNum <= 100) {
                finalResult = "NO";
                break;
            }
        }
        System.out.println("finalResult2 = " + finalResult);
    }
}
