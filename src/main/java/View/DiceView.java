package View;

import View.CapitalView;

public class DiceView {
    private CapitalView view;

    public void update(int name, int move){
        //TODO print out who moved for how many steps
        System.out.println("Dice " + name + " tossed number :" + move);
    }
}
