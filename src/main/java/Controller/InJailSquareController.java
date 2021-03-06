package Controller;

import Model.InJailSquare;
import View.InJailSquareView;

public class InJailSquareController extends SquareController {
	private InJailSquare model;
	private InJailSquareView view;
	
	public InJailSquareController(InJailSquare model, InJailSquareView view) {
		super(model,view);
		this.model = model;
		this.view =view;
	}
	
	public int callAskPayOrDice(int diceTime, int dice1Result, int dice2Result) {
		return model.askPayOrDice(diceTime, dice1Result, dice2Result);
	}

	public void printJustVisit(){
		view.printJustVisit();
	}
}
