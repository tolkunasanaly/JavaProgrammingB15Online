package Homeworks;

public class Unique {
    public static void main(String[] args) {

            String letters="aaaabbbbbcccaabbcd";
            String unique="";
            for(int i=0;i<letters.length();i++){
                if(!unique.contains(letters.charAt(i)+""))
                    unique=unique+letters.charAt(i);
            }
            System.out.println(unique);
        }
    }

