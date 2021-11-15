package View;

public class GameView {
    public void printMap(){
        System.out.print("============================================================================\n");
        System.out.print("| 01           | 02 Sky       | 03 Sky       | 04 Sky       | 05 Sky       |\n");
        System.out.print("| Go           | Central      | Wan Chai     | Income Tax   | Stanley      |\n");
        System.out.print("|              | $ 800        | $ 700        |              | $ 500        |\n");
        System.out.print("|              |              |              |              |              |\n");
        System.out.print("|              | P1 Owned     |              |              |              |\n");
        System.out.print("============================================================================\n");
        System.out.print("| 06           | 07 Blue      | 08 Blue      | 09 Blue      | 10 Blue      |\n");
        System.out.print("| InJail       | Shatin       | Chance       | Tuen Mun     | Tai Po       |\n");
        System.out.print("| $ 800        | $ 700        |              | $ 400        | $ 500        |\n");
        System.out.print("|              |              |              |              |              |\n");
        System.out.print("|              | P1 Owned     |              |              |              |\n");
        System.out.print("============================================================================\n");
        System.out.print("| 11           | 12 Blue      | 13 Blue      | 14 Blue      | 15 Blue      |\n");
        System.out.print("| Free Parking | Shatin       | Chance       | Tuen Mun     | Tai Po       |\n");
        System.out.print("| $ 800        | $ 700        |              | $ 400        | $ 500        |\n");
        System.out.print("|              |              |              |              |              |\n");
        System.out.print("|              | P1 Owned     |              |              |              |\n");
        System.out.print("============================================================================\n");
        System.out.print("| 16           | 17 Blue      | 18 Blue      | 19 Blue      | 20 Blue      |\n");
        System.out.print("| Free Parking | Shatin       | Chance       | Tuen Mun     | Tai Po       |\n");
        System.out.print("| $ 800        | $ 700        |              | $ 400        | $ 500        |\n");
        System.out.print("|              |              |              |              |              |\n");
        System.out.print("|              | P1 Owned     |              |              |              |\n");
        System.out.print("============================================================================\n");
    }

    public void printTurnQuestion(int turns){
        System.out.println("This is turn: " + turns);
        System.out.println("What action you want to do");
        System.out.println("1) Toss Dice");
    }

    public void printWrongInput(){
        System.out.println("Wrong Input");
    }

    public void printPlayerPosition(int playerNum, int pos){
        System.out.println("Player " + playerNum + ". You are in Square No.: " + pos + ".");
    }

    public void printTurnsLimit(){
       System.out.println("Turns reached 100 rounds, Game End.");
    }

    public void printOnePlayerLeft(int winner){
        System.out.println("Only one Player left. Player " + winner + " is the winner.");
    }
}
