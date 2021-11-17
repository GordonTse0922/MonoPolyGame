package Controller;

import Model.TaxSquare;
import View.TaxSquareView;

public class TaxSquareController extends SquareController {
	private TaxSquare model;
	private TaxSquareView view;
	
	public TaxSquareController(TaxSquare model, TaxSquareView view) {
		super(model,view);
		this.model = model;
		this.view =view;
	}
	
	public int callPayTax(int playerCapital) {
		int amount = model.payTax(playerCapital);
		view.printPayTaxAmount(amount);
		return amount;
	}
}
