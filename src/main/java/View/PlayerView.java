package View;

public class PlayerView {
    public void printPlayerPosition(int playerNum, int pos){
        System.out.println("Player " + playerNum + ". You are in Square No.: " + pos + ".");
    }

    public void printPlayerStatus(int playerNum, int pos, int capital, boolean jail, int jailDice){
        System.out.println("Player " + playerNum + ". You are in Square No.: " + pos + ".");
        System.out.println("Money : $" + capital);
        System.out.println("Jailed: " + jail);
        System.out.println("DiceJa: " + jailDice);
    }

    public void printYouBroke(int playerNum) {
        System.out.println("Player " + playerNum + ". You are Broken. No action can take.");
    }

    public void printCapital(int playerNum, int amount){
        System.out.println("Player " + playerNum + ". You have money $" +amount);
    }
}
