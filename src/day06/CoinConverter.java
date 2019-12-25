package day06;

public class CoinConverter {

    public static void main(String[] args) {

        //you have 200 cent
        //how many quarters you can get 25c
        //how many dimes you can get (dime = 10 cent)
        //how many Nickel you can get 5c
        //how many penny you can get

        int cent = 200;

        //you have purchase candle for 0.74 cent
        //what would be your remainder

        cent -= 74; // 126 cent after spending 74 cent for candle
        int quarter = cent/25;
        int penny = cent%25;

        System.out.println(quarter);
        System.out.println(penny);

        // now I want to try to calculate dime for same money I got after purchase
        //in dime

        int dime = cent / 10; // 126 /10 === 12
                  // how much penny I have after getting dime 126 % 10 ===6

        //penny2 not to confuse with previous penny

        int penny2 = cent %10; ///=====

        System.out.println(dime);
        System.out.println(penny2);


    }
}
