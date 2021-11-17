package View;

import View.SquareView;

public class TaxSquareView extends SquareView {
    public void printPayTaxAmount(int amount){
        System.out.println("You have to pay : $" + amount + " for Income Tax.");
    }
}
