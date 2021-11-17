package Controller;

import Model.Dice;
import View.DiceView;

public class DiceController {
    private Dice dice;
    private DiceView view;
    public  DiceController(int name){
        dice = new Dice(name);
        view=new DiceView();
    }
    public int toss(){
        int result = dice.toss();
        updateAfterToss(result);
        return result;
    }
    public void updateAfterToss(int moves){
        view.update(getName(), moves);
    }

    public int getName(){
        return dice.getName();
    }
}