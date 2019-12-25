package day23;

public class ForEachLoopPracticeFindMax {
    public static void main(String[] args) {

        //create a long array or 5 items called salaries
        //put your salary amounts that ok for your offer

        //use FOR EACH LOOP to iterate over them
        //and print them out

        //OPTIONALLY
        //print only the salary more than 100000

        long[] salaries = {150000L, 170000L, 635000L, 85000L, 1100000L};

        // I need to pick up an item from this array so I can compare with other items
        //since first one is right there, I just decided to pick it up
        //and make it temporarily the max value
        //can I pick up 2nd or 3rd instead ---->>>> YES

        long maxSalary = salaries[0];

        for (long salary : salaries) {
            if (salary > maxSalary) {

                maxSalary = salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);
    }
}

