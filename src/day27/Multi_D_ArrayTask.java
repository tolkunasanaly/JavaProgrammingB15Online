package day27;

public class Multi_D_ArrayTask {
    public static void main(String[] args) {

        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15}, {100, 90, 98, 7888}, {900, 800, 600, 500}};
        //                         0              1                 2
        int max = numbers[0][0]; // assume that first element is the Max

        for (int i = 0; i < numbers.length; i++) {   //check each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) {  //each element in the single dimensional array
                if (max < numbers[i][j]) {  //compares index 0 of the array with each indexes
                    max = numbers[i][j]; // assigns the max number
                }
            }
        }
        System.out.println(max);
        System.out.println("================");

        //solution 2;

        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers) {   //variable each1DArray represents each single dimensional array
            for (int eachInt : each1DArray) {
                if (max2 < eachInt) {
                    max2 = eachInt;
                }
            }
        }
        System.out.println("Max Number is: " +max2);
        System.out.println("===============");

        //Find the Min numbers
        int min = numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(min>numbers[i][j]){
                    min=numbers[i][j];
                }
            }

        }
        System.out.println("Min Number is: " + min);

        System.out.println("=============");
        String [] developersTeam = {"Vladislav", "Hasan", "Tolkun"};
        String [] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};


    }
}
