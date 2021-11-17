package View;

import Controller.PropertySquareController;

import java.util.List;

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

    /*
    public void printProperty(int playerNum, List<PropertySquareController> property){
        System.out.println("\nPlayer " + playerNum + " owned Properties :");
        for (int i = 0; i<property.size(); i++){
            System.out.println(property.get(i).getSquareName() + " " + property.get(i).getPropertyCost());
        }
    }
    */
}
