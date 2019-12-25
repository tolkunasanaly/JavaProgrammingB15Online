package repl;
import java.util.Scanner;
public class BiggerSmaller {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);



        //WRITE YOUR CODE HERE:
        System.out.println("First number");int a = s.nextInt();
        System.out.println("Second number"); int b = s.nextInt();
        if (a>b){
            System.out.println(a +" is greater");
        }
        else if(b>a){
            System.out.println(b +" is greater");
        }

    }
}
