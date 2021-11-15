package Controller;

import Model.TaxSquare;
import View.TaxSquareView;

public class TaxSquareController extends SquareController {
	private TaxSquare model;
	private TaxSquareView view;
	
	public TaxSquareController(TaxSquare model, TaxSquareView view) {
		super(model,view);
	}
	
	public int callPayTax() {
		return model.payTax(1500);
	}
}
