public class DieController {
    Die dice;
    public void DieController(){
        dice = new Die();
    }
    public int toss(){
       return dice.toss();
    }
}
