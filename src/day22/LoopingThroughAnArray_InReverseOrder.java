package day22;

public class LoopingThroughAnArray_InReverseOrder {

    public static void main(String[] args) {


        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int elementCount=scores.length;   //4
        int lastItemIndex=elementCount-1;  //3

        //we are printing in reverse order so
        // we start with highest index till lowest index 0 --->>>3-0



        for(int x = lastItemIndex; x>=0; x--){
            System.out.println("index location " + x);
            System.out.println(scores[x]);
        }

        }

    }

