package officehour;

public class ArrayPractice_12_10 {
    public static void main(String[] args) {


        String[] cars = {"bmw", "wv", "audi"};
                         //0     1      2
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        
        // for each loop
        
        //temporary variable  :   array name
        for ( String carModel  : cars){
            System.out.println("Car Model = " + carModel);
        }
        /*
        * String carModel : cars
        *           carModel="bmW"
        *           carModel="wv"
        *           carModel="audi"
        *
        * */
    }
}
