package Controller;

import Model.InJailSquare;
import View.InJailSquareView;

public class InJailSquareController extends SquareController {
	private InJailSquare model;
	private InJailSquareView view;
	
	public InJailSquareController(InJailSquare model, InJailSquareView view) {
		super(model,view);
	}
	
	public int callAskPayOrDice(int diceTime) {
		return model.askPayOrDice(diceTime);
	}
}
