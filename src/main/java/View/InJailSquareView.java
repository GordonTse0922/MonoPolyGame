package View;

import View.SquareView;

public class InJailSquareView extends SquareView {
    public void askPayOrDice(){
        System.out.println("\nPay Or Dice\n1) Pay $150\n2) Dice");
    }

    public void printWrongInput(){
        System.out.println("Wrong Input");
    }

    public void printJustVisit(){
        System.out.println("You visited the Jail. No effect.");
    }

    public void printRemainJailed() {
        System.out.println("Remain Jailed.");
    }

    public void printQuitJailFree(){
        System.out.println("Dice tossed double. You can leave for free.");
    }

    public void printQuitJailPay(){
        System.out.println("You paid $150 to leave.");
    }
}
