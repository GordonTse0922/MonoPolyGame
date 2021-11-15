package Controller;

import Model.ChanceSquare;
import View.ChanceSquareView;

public class ChanceSquareController extends SquareController {

	private ChanceSquare model;
	private ChanceSquareView view;
	
	public ChanceSquareController(ChanceSquare model, ChanceSquareView view) {
		super(model,view);
	}
	
	public int callRandomAmount() {
		return model.randomAmount();
	}
}
