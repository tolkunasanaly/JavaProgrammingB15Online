package day13;

public class WarmUp_AmazonShippingCalculator2 {
    public static void main(String[] args) {

        //Create boolean to store the result of youWantToShop
        //if yes, do you want to go to Store or do you wanna shop online

        //if user do not wanna shop at all, print Good job, stay home Coding!!!

        boolean youWantToShop = true;
        String preference = "online";

        // if(youWantToShop)
        if (youWantToShop == true) {

            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going to online for shopping");
            }


        } else {
            System.out.println("Good job, stay home Coding!!!");
        }


    }
}
