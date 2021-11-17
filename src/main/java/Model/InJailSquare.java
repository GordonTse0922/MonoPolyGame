package Model;

import Model.Square;
import Controller.DiceController;
import View.InJailSquareView;

import java.util.Scanner;

public class InJailSquare extends Square {
	public InJailSquare (String name, int index) {
		super(name, index);
	}
	
	public int askPayOrDice(int diceTime) {
		int isQuitJail = 0;
		
		//TODO 0 = Remain Jailed, 1 = QuitJail in Free, 2 = QuitJail by Pay HKD 150, -1 = Parameter Error
		
		//TODO Check diceTime > 3?
		//TODO If diceTime < 3
		//TODO 		System print out ask for Pay HKD 150 or Model.Dice
		//TODO 		If Pay, Deduct Model.Player amount, return true
		//TODO 		If Model.Dice, Run Model.Dice Function.
		//TODO			If Two Model.Dice Same Num, isQuitJail = 1;
		//TODO 			Else isQuitJail = 0;
		//TODO Else
		//TODO 		isQuitJail = 2

		if (diceTime < 3) {
			Scanner input=new Scanner(System.in);

			InJailSquareView view = new InJailSquareView();

			boolean playerInputFinish = false;
			while(!playerInputFinish){
				view.askPayOrDice();
				int result = input.nextInt();
				if (result == 1) {
					isQuitJail = 2;
					playerInputFinish = true;
				} else if (result == 2){
					DiceController dice1 = new DiceController(1);
					DiceController dice2 = new DiceController(2);

					int diceResult1 = dice1.toss();
					int diceResult2 = dice2.toss();

					if (diceResult1 == diceResult2){
						isQuitJail = 1;
					}
					playerInputFinish = true;
				} else {
					view.printWrongInput();
				}
			}
		} else {
			isQuitJail = 2;
		}
		
		return isQuitJail;
	}
}
