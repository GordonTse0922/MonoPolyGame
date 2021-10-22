public class DiceController {
    Dice dice;
    DiceView view;
    public  DiceController(){
        dice = new Dice();
        view=new DiceView();
    }
    public int toss(){
       return dice.toss();
    }
    public void updateAfterToss(int moves){
        view.update();
    }
}
