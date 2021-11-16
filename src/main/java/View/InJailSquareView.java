package View;

import View.SquareView;

public class InJailSquareView extends SquareView {
    public void askPayOrDice(){
        System.out.println("Pay Or Dice\n1) Pay $150\n2) Dice");
    }

    public void printWrongInput(){
        System.out.println("Wrong Input");
    }
}
