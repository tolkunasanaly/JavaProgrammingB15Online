package day35;

public class StringToIntegerParsing {
    public static void main(String[] args) {

        //I have an employee ID : "FB-457"
        //give me the employee number and store it into a number

        String strNum = "100";
        int  num = Integer.parseInt(strNum);
        System.out.println("num = " + num);
        
        
        String empID = "FB-457";
        /**
         * Integer class is class coming from java.lang package
         * It's primarily used for wrapping up primitive value and treat it as an object
         * what we will focus here is though
         * many useful static methods provided already
         * parceInt is a static method of Integer Class
         * It will turn a String that has only numbers and return int result
         * if we have any non-numerical character -->> It will throw NumberFormat
         *
         */
       // int id = Integer.parseInt(empID);


        String [] empIDspllit=empID.split("-");
        String idStr = empIDspllit[1];
        int id = Integer.parseInt(idStr);
        System.out.println("id = " + id);




        //I have a String called twoNumbers
        //String twoNumbers = "100,600";

        String num1Str = "100";
        String num2Str = "600";

        //I want you to add them and give the result

        //IN ORDER TO PERFORM ARITHMETIC OPERATION
        // WE MUST HAVE NUMBERS STORED IN int
        //SO FIRST WE NEED TO TURN STRING TO INT
        //JDK ALREADY PROVIDED SUCH METHODS
        //AND IT COMES FROM INTEGER CLASS FROM java.lang package
        //Integer.parseInt("YourNumberInString");

        int num1 = Integer.parseInt(num1Str);
        int num2 =Integer.parseInt(num2Str);

// Version 2:  int sum = Integer.parseInt(num1Str)+Integer.parseInt(num2Str);

        System.out.println("Sum of num1 and sum2 = " + (num1+num2));


    }
}
