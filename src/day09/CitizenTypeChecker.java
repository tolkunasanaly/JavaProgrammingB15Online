package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {

//        // Task 2
//        Create a class called CitizenTypeChecker with main method
//       Create a variable called citizenType as String
        String citizenType;

//       And create a variable with age
        int age = 78;

//       If the age  is more than 65 , assign value of  citizenType to Senior
//        If not , assign value of  citizenType to Not-Senior
        if(age>65){
            citizenType ="Senior";
        } else {
            citizenType ="Not Senior";
        }
        System.out.println("The citizen age is " +age+ ", he is a " +citizenType);
    }
}
