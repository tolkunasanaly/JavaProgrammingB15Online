package Homeworks;
import java.util.*;
public class Excel_Sheet {
    public static void main(String[] args) {

        //    int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        int [][] nums = {{78, 54, 100, 84}, {33, 44, 77, 123}, {12, 88, 52, 76},
                          {67, 33, 98, 67}, {12, 88, 52, 45}, {67, 33, 98, 34}};

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                System.out.println("Cell("+(i+1)+","+(j+1) + ")= " + nums[i][j]+" ");
            }
            System.out.println();
        }



    }
}
