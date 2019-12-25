package day11;

public class ScoreChecker {
    public static void main(String[] args) {

        //create a program to check the score: ScoreChecker with main method

        //Create a variable called score assign a value of your choice

        //if the score is less than 0 or more than 100---> invalid score
        //if the score is  100 --->> perfect score
        //if the score is between 70-100 ---->>> you have passed
        //Else you have failed!!!!

        int score = 70;

        System.out.println("Exam Results:");

        if (score <0 || score >100){
            System.out.println("Invalid Score");
        }else if (score ==100) {
            System.out.println("Perfect Score");
        }else if(score >= 70 && score <100) {
            System.out.println("You have passed");
        }else if (score <20){
            System.out.println("Come to my office");
        }else {
            System.out.println("You have failed");
        }
    }
}
