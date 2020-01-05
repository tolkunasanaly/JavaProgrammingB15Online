package repl;
import java.util.*;
public class Citizens {
    public static void main(String[] args) {

//      -Declare int variables: seniorCitizens, nonSeniorCitizens, age
        int seniorCitizens, nonSeniorCitizens;
//-Create a Scanner object
        Scanner scan = new Scanner(System.in);

//- Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
//"Enter current count for seniorCitizens and nonSeniorCitizens:"
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens = scan.nextInt();
        nonSeniorCitizens=scan.nextInt();

//
//-Ask user to enter age:
//"What is new citizen's age?"
        System.out.println("What is new citizen's age?");
        int age= scan.nextInt();
        if (age >= 65){
            seniorCitizens++;
            System.out.println("Senior Citizen");
        }else if(age<65){
            nonSeniorCitizens++;
            System.out.println("Non-Senior Citizen");
        }
        System.out.println("New seniorCitizens count ValueOfVariable " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count ValueOfVariable " + nonSeniorCitizens);
//
//-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.
//
//-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.
//
//-At last, print another message:
//"New seniorCitizens count ValueOfVariable"
//"New nonSeniorCitizens count ValueOfVariable"
//
//Example Run:
    }
}
