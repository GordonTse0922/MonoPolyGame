package Model;

import Model.Square;
import Controller.DiceController;
import View.InJailSquareView;

import java.util.Scanner;

public class InJailSquare extends Square {
	public InJailSquare (String name, int index) {
		super(name, index);
	}
	
	public int askPayOrDice(int diceTime, int dice1Result, int dice2Result) {
		int isQuitJail = 0;
		InJailSquareView view = new InJailSquareView();

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

		if (diceTime > 0) {
			Scanner input3=new Scanner(System.in);

			boolean playerInputFinish = false;
			while(!playerInputFinish){
				view.askPayOrDice();
				int result = input3.nextInt();
				if (result == 1) {
					isQuitJail = 2;
					playerInputFinish = true;
				} else if (result == 2){
					if (dice1Result == dice2Result){
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

		if (isQuitJail == 0){
			view.printRemainJailed();
		} else if (isQuitJail == 1){
			view.printQuitJailFree();
		} else if (isQuitJail == 2){
			view.printQuitJailPay();
		}
		
		return isQuitJail;
	}
}
