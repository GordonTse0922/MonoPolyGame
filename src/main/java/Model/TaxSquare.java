package Model;

import Model.Square;

public class TaxSquare extends Square {
	public TaxSquare (String name, int index) {
		super(name, index);
	}
	
	public int payTax(int playerAmount) {
		int tax = -1;
		if (playerAmount >= 0) {
			tax = ((playerAmount / 10) / 10) * 10;
		}
		//TODO Pay 10% of player's money. return -1 if parameter < 0
		return tax;
	}
}
