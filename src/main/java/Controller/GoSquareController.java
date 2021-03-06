package Controller;

import Model.GoSquare;
import View.GoSquareView;

public class GoSquareController extends SquareController {
	private GoSquare model;
	private GoSquareView view;
	
	public GoSquareController(GoSquare model, GoSquareView view) {
		super(model,view);
		this.model = model;
		this.view =view;
	}
	
	public int callGainSalary() {
		return model.gainSalary();
	}

	public void printPassGo() {
		view.printPassGo();
	}

	public void printInGo() {
		view.printInGo();
	}
}
