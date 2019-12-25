package day12;

public class IfElseWeather {
    public static void main(String[] args) {
        String myWeather ="Sunny";
        if(myWeather.equals("Cloudy")){
            System.out.println("Code in Cloudy weather");
        }else if (myWeather=="Sunny"){
            System.out.println("COde in Sunny weather");
        }else if (myWeather=="Rainy"){
            System.out.println("Code in Rainy weather");
        }else if(myWeather=="Snowy"){
            System.out.println("Code in Snowy weather");
        }else
        {
            System.out.println("Rain or Shine Just keep coding");
        }
    }
}
