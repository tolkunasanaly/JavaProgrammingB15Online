package day16;

public class CountFrom10To1 {
    public static void main(String[] args) {
        //i want to start with 10, then decrease the value by one

        int count= 10;

        while(count >=1){

            System.out.println(count);
            --count;
        }
        System.out.println("Final value of count is: " + count);

    }
}
