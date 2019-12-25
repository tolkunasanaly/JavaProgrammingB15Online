package day27;

public class Multi_Dimensional_Array_Practice_2 {
    public static void main(String[] args) {


        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa", "Ershad", "Naila", "A"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysitsTeam};

        //find the shortest string of text
        int minLenght = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];

        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                if (minLenght > scrumTeam[i][j].length()) {
                    minLenght = scrumTeam[i][j].length();
                    shortestString = scrumTeam[i][j];
                }
            }
        }
        System.out.println(minLenght);
        System.out.println(shortestString);
    }
}

