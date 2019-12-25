package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        //create a long array or 5 items called salaries
        //put your salary amounts that ok for your offer

        //use FOR EACH LOOP to iterate over them
        //and print them out

        //OPTIONALLY
        //print only the salary more than 100000
        
        long [] salaries = {150000L, 170000L, 635000L, 85000L, 1100000L  } ;

        for (long eachSalary: salaries ) {

            System.out.println("Each Salary = " + eachSalary);

            }
        for (long salary : salaries){
//            if (salary>100000){
//                System.out.println("salary = " + salary);
//            }
            if (salary<100000){
                continue;
            }
            System.out.println("salary = " + salary);
        }
        }
    }

