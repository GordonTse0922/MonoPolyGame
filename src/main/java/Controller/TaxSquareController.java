package Controller;

import Model.TaxSquare;

public class TaxSquareController extends SquareController {
	private TaxSquare model;
	private TaxSquareView view;
	
	public TaxSquareController(TaxSquare model, TaxSquareView view) {
		super(model,view);
		this.model = model;
		this.view = view;
	}
	
	public int callPayTax() {
		return model.payTax(1500);
	}
}
