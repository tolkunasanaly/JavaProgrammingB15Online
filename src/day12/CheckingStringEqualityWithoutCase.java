package day12;

public class CheckingStringEqualityWithoutCase {
    public static void main(String[] args) {
        String userName="aBc123" ;
        boolean userNameCorrect = userName.equals("ABC123");

        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase =userName.equalsIgnoreCase("ABC123");
        System.out.println(nameCheckIgnoreCase);

    }
}
