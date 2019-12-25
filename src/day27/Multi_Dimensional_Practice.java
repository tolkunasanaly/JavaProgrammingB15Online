package day27;
import java.util.*;
public class Multi_Dimensional_Practice {
    public static void main(String[] args) {

            //  N dimesional Array MUST contains (N-1) demesional arrays

            // 2 dimensional array MUST contains (2-1) demesional arrays
            //                            0        1              0         1
            String[][] names = {{"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"}};
            //                              0                              1

            // print Hasan:
            System.out.println(names[1][0]);

            // print Tetiana:
            names[1][1] = "Dilshat";
            System.out.println(names[1][1]);

            // print Hashan & dilshat
            System.out.println(Arrays.toString(names[1]));

            // print: {  {"Rukhshona"  ,"Ghoya" }  ,  {"Hasan", "Tetiana"  }  }
            System.out.println(Arrays.deepToString(names));
        System.out.println("=======================================");

            int [][] numbers = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
            //                     0       1       2         3
        for (int i = 0; i <numbers.length ; i++) {
          // System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println("\n=======================================");


        ////Print all the even numbers

        int [][] ages = {{10},{12,13,14,16,17},{19,20,21,22,23}};
        //                     0       1       2         3
        for (int i=0 ; i <ages.length ; i++) {

            for (int j = 0; j <ages[i].length ; j++) {
                /*if(ages[i][j]%2!=0){             //skipping odd numbers
                   continue;
                } */

                if (ages[i][j]%2==0){
                    System.out.print(ages[i][j] + " ");
                }

            }
        }

        System.out.println("\n=======================================");
        int[] arr1D = {1,2,3};

        for (int each : arr1D) {
            System.out.print(each + " ");
        }
        System.out.println("\n=======================================");

        int [][] arr2D = {{10, 20, 30},{40,50,60,70,80,90,100}};

        for(int[] each1DArray : arr2D){ // variable name each1DArray represents each index
            for (int eachElement : each1DArray) {
                System.out.print(eachElement+ " ");
            }

        }

        }
}
