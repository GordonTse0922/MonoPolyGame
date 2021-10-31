package Model;

import Model.Square;

public class TaxSquare extends Square {
	public TaxSquare (String name, int index) {
		super(name, index);
	}
	
	public int payTax() {
		int tax = 0;
		//TODO Pay 10% of player's money.
		return tax;
	}
}
