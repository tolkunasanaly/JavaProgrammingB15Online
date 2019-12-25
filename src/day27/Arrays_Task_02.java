package day27;

public class Arrays_Task_02 {
    public static void main(String[] args) {
        /*
        Task 2:
        write a program that returns the maximum number from an array
        DO NOT USE sort method
        * */
        int [] nums = {100, 10000, 9999, 8888, 1231, 2345};
        int max= nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("First max number = " + max);

        //Second Max Value
        int secondMax= nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(secondMax<nums[i] && nums[i]!=max){
                secondMax=nums[i];
            }

        }
        System.out.println("second Max number = " + secondMax);
    }
}
