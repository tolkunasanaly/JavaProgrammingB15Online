package officehour;

public class JumpCount {
    public static void main(String[] args) {
        for(int jumpCount = 1; jumpCount<=100; jumpCount++){
            System.out.println("I jumped " + jumpCount + " times");
        }

        //1 to 10 even number

        for (int num=1; num<=10; num++){
           if(num%2==0){
               System.out.println(num);
           }

        }
        for (int number =1; number <= 10; number+=2){
            System.out.println(number);
        }

    }
}
