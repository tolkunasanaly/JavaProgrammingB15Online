package day06;
import java.util.Scanner;
public class DiscountPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //if you have variables with same data type, you can declare them in one line like this:
      //   double regularPrice, salePrice, discount;

        System.out.println("What is the regular price for this T-Shirt?");
        double regularPrice = scan.nextDouble();
        System.out.println("What is the discount rate?");
        double discount = scan.nextDouble();
        double salePrice =regularPrice-regularPrice*discount;
        System.out.println("Regular price is " + regularPrice + "$, discount is " + discount+
                " and your deal for " + salePrice);

    }
}
