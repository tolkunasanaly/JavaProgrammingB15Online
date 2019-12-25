package day10;

public class SeasonAction {
    public static void main(String[] args) {

        /*
        * What do you do in each season
        *
        * Spring --->> Hike! Easter! Nevruz! Blossom!
        * Summer --->> Swim, Vacation, BBQ, Holiday
        * Fall --->> Black Friday, Hiking, Harvest, Halloween, Shopping
        * Winter ---->> Snowboarding, Ski, Christmas, New Year
        *
        * */
        String season = "Java";
        switch (season){
            case "Spring":
                System.out.println("It's Spring! Hike! Easter! Nevruz! Blossom!");
                break;
            case "Summer":
                System.out.println("It's Summer! Swim, Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("It's Fall! Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter":
                System.out.println("It's Winter! Snowboarding, Ski, Christmas, New Year");
                break;
            default:
                System.out.println("Invalid info");

        }

    }
}
