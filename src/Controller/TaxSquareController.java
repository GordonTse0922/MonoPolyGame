package Controller;

import Model.TaxSquare;
import View.TaxSquareView;

public class TaxSquareController extends SquareController {
	private TaxSquare model;
	private TaxSquareView view;
	
	public TaxSquareController(TaxSquare model, TaxSquareView view) {
		super(model,view);
		this.model = model;
		this.view = view;
	}
	
	public int payTax() {
		int tax = 0;
		//TODO Pay 10% of player's money.
		return tax;
	}
}
