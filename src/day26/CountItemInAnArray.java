package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {

        String [] marvelHeroes= {"Iron Man", "Captain America", "Spider man",
                               "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                               "Captain America", "Spider man",
                                "Black Widow", "Wanda", "Captain Marvel",
                                "Captain America"};

        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeroes));
        int sizeOfArray=marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch="Black Widow";
        int countOfItem = 0;

        for (String eachHero : marvelHeroes){

            if(eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }

        //count the hero with the name that contains black in case insensitive manner
        int cntOfBlackInName=0;
        for (String eachHero:marvelHeroes){

            //in order to not care about teh case , make all lowercase then check contains
            if (eachHero.toLowerCase().contains("black")){
                cntOfBlackInName++;
            }
        }

        System.out.println("Count Of Black In Name = " + cntOfBlackInName);

}}
