public class DieController {
    Die dice;
    DieView view;
    public  DieController(){
        dice = new Die();
        view=new DieView();
    }
    public int toss(){
       return dice.toss();
    }
    public void updateAfterToss(int moves){
        view.update();
    }
}
