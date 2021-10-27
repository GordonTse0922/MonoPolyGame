public class DiceController {
    private Dice dice;
    private DiceView view;
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