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
		if (diceTime >=0 &&diceTime<3) {
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
