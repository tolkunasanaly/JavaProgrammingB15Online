package day33;

public class ReturnKeywordPractice {
    public static void main(String[] args) {
        System.out.println(calculateAgeFromBirthYear(1988));
    }
    /**
     * Create a class called ReturnKeywordPractice with main
     * calculateAndReturnAge
     * Write a method accept a birth year and return the age :
     * the birth year should be within the range of 1900-2020
     * if not return 0
     *
     *
     * optionally : test your code against array of birthYears
     * {1999,122,2019, 1987, 1978,1964,3999, 2004}
     */

    public static int calculateAgeFromBirthYear(int age){
          if(age>=1900 && age<=2020){
              age=2020-age;
          }else{
              age=0;
          }

        return age;
    }

}
