package day21;

public class SkippAll5 {
    public static void main(String[] args) {

        for (int x=1; x<=100;x++){
            if(x%5 == 0){
                System.out.println("Skipping " +x);
                continue;
            }
            System.out.println(x);
        }

//        for(int x= 1; x<=100; x++){
//            if (x%5 !=0){
//                System.out.println(x);
//            }else{
//                System.out.println("Skipping "+ x);
//            }
        }

    }

