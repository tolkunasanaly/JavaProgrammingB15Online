package day20;
public class SumOfOddAndEven {
    public static void main(String[] args) {
        //give me the sum of odd numbers from 10 - 100
        int sumofOdd=0;
        int sumOfEven=0;

        for( int x=10; x<=100; x++){
            if( x%2==1){   //Odd number

                sumofOdd = sumofOdd +x;
            }else if(x%2==0){
                sumOfEven = sumOfEven+x;
            }

        }
        System.out.println("SUM OF ODD: "+sumofOdd);
        System.out.println("SUM OF EVEN: " +sumOfEven);
    }
}
