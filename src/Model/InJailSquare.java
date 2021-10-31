package Model;

import Model.Square;

import java.util.Scanner;

public class InJailSquare extends Square {
	public InJailSquare (String name, int index) {
		super(name, index);
	}
	
	public int askPayOrDice(int diceTime) {
		int isQuitJail = 150;
		
		//TODO 0 = Remain Jailed, 1 = QuitJail in Free, 2 = QuitJail by Pay HKD 150
		
		//TODO Check diceTime > 3?
		//TODO If diceTime < 3
		//TODO 		System print out ask for Pay HKD 150 or Model.Dice
		//TODO 		If Pay, Deduct Model.Player amount, return true
		//TODO 		If Model.Dice, Run Model.Dice Function.
		//TODO			If Two Model.Dice Same Num, isQuitJail = 1;
		//TODO 			Else isQuitJail = 0;
		//TODO Else
		//TODO 		isQuitJail = 2
		
		return isQuitJail;
	}
}
