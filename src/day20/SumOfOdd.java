package day20;
public class SumOfOdd {
    public static void main(String[] args) {
        //give me the sum of odd numbers from 10 - 100
        int sum=0;
        for( int x=10; x<=100; x++){
            if( x%2==1){   //Odd number

                sum = sum +x;
            }

        }
        System.out.println(sum);
    }
}
