public class InJailSquareController extends SquareController{
	private InJailSquare model;
	private InJailSquareView view;
	
	public InJailSquareController(InJailSquare model, InJailSquareView view) {
		this.model = model;
		this.view = view;
	}
	
	public int askPayOrDice(int diceTime) {
		int isQuitJail = 150;
		
		//TODO 0 = Remain Jailed, 1 = QuitJail in Free, 2 = QuitJail by Pay HKD 150
		
		//TODO Check diceTime > 3?
		//TODO If diceTime < 3
		//TODO 		System print out ask for Pay HKD 150 or Dice
		//TODO 		If Pay, Deduct Player amount, return true
		//TODO 		If Dice, Run Dice Function.
		//TODO			If Two Dice Same Num, isQuitJail = 1;
		//TODO 			Else isQuitJail = 0;
		//TODO Else
		//TODO 		isQuitJail = 2
		
		return isQuitJail;
	}
}