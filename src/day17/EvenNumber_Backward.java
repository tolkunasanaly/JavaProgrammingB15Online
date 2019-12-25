package day17;

public class EvenNumber_Backward {
    public static void main(String[] args) {

        int evenNumber = 100;
        while(evenNumber>0){
            if(evenNumber %2 ==0){
                System.out.print(" " + evenNumber);
            }
            --evenNumber;
        }

    }
}
