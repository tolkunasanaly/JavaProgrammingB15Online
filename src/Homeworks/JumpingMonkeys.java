package Homeworks;

public class JumpingMonkeys {
    public static void main(String[] args) {

       int monkey =5;

       while(monkey>=1){
           System.out.println("One fell down and bumped his head,\n" +
                   "Mama called the doctor and the doctor said,\n" +
                   "No more monkeys jumping on the bed!");
           --monkey;
       }
        System.out.println("Put those monkeys right to bed!");
    }
}
