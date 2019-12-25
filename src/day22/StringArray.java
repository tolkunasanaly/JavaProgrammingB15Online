package day22;

public class StringArray {
    public static void main(String[] args) {
        //create a string array with size that you define
        //and store all your household member names

        String [] member = new String[4];

        member[0]="Sharapat";
        member[1]="Talantbek";
        member[2]="Talasbek";
        member[3]="Tolkun";

        System.out.println(member[0]);
        System.out.println(member[1]);
        System.out.println(member[2]);
        System.out.println(member[3]);

        //IMMUTABLE means you can not change the internal structure of the object
        //if you have String abc = "Hello"
        //if you do abc.Uppercase -->> it will create new String object "Hello"
        //and it does not change original Hello at all!!!

        //not resizable --->>> specifically for array
        //we can not change the size of array once we create them with certain size
        //However, we can change the elements inside this array
        //and it means: IT IS NOT IMMUTABLE

    }
}
