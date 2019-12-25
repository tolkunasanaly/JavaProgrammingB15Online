package day17;

public class OnlyOddNumber {
    public static void main(String[] args) {

        int oddNum = 100;

        while(oddNum>0){

            //if oddNumber divided by 2 have remainder
            //for example 5/2=2 1 remain   5%2=1 1!=0

            if (oddNum %2 !=0){
                System.out.println(oddNum+ " is Odd Number");
            }
            --oddNum;
        }
    }
}
