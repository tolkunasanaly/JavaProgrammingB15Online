package day03;

public class PrimitivesPractice {

    public static void main(String[] args){

        byte letterCount = 26;
        System.out.println("The letter count is: " + letterCount);
        short sheepCount = 300;
        System.out.println("The sheep count is: " + sheepCount);
        int catCount = 20;
        System.out.println("The cat count is: " + catCount);
        long mileToMoon = 5000000l;
        System.out.println("The distance from Earth to Moon is: " + mileToMoon);
        long mileToSun = 1000000L;
        System.out.println("The distance from Earth to Sun is: " + mileToSun);
        // -------floating point------------
        //you must "f" at the end of number to indicate this is float type
        float priceOfBanana = 1.99f;
        System.out.println("The price of Banana is: " + priceOfBanana);
        float priceOfPotato = 2.49F;
        System.out.println("The price of Potato is: " + priceOfPotato);
        //--------- larger floating point number----------
        double priceOfIpad1 = 350.99d;
        System.out.println("The price of Ipad is: " + priceOfIpad1);
        double priceOfIpadPro = 1024.99D;
        System.out.println("The price of IpadPro is: " + priceOfIpadPro);
        //compiler automatically assumes it's a double so it's not required to have d
        //however for good programming habbit, add them always
        double priceOfMac = 2299.99;
        System.out.println("The price of Mac is: " + priceOfMac);

        //If you have a whole number by itself (100), compiler automatically assumes it's an int
        //If you have a fractional number by itself (100), compiler automatically assumes it's a double
    }


}
