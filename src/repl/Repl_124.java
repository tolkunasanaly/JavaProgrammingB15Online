package repl;

import java.util.*;

public class Repl_124 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),
                                input.nextInt(),input.nextInt()};


//        nums -> [4, 3, 2, 44, 1, 100, 55]
//        change it to:
//        nums -> [55, 100, 1, 44, 2, 3, 4]
//    }


        int size = nums.length;
        int lastIndex = size-1;
        int middleIndex=size/2;

        for (int x = 0; x <middleIndex ; x++) {

            int temp = nums[x];
            nums[x]=nums[lastIndex-x];
            nums[lastIndex-x]=temp;
        }
        System.out.println(Arrays.toString(nums));

    }
}
