package repl;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name ");
        String firstName=scan.next();
        System.out.println("Enter your last name");
        String lastName= scan.next();
        System.out.println("Enter your email");
        String email= scan.next();
        System.out.println("Enter your street");
        String street= scan.next();
        System.out.println("Enter your city");
        String city= scan.next();
        System.out.println("Enter your state");
        String state= scan.next();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age= scan.nextInt();
        System.out.println("Enter your height");
        double height= scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        System.out.println("Patient personal information");
        String fullName= lastName+", "+firstName;
        System.out.println("Full name: " +fullName);

        String address= street+", " + city +", " + state+", " +zipCode;
        System.out.println(address);
        String contacts = workPhoneNumber+ ", " + personalPhoneNumber+ ", " +email;
        System.out.println(contacts);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(isMarried);

    }}
