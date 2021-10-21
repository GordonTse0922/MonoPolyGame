public class TaxSquareController extends SquareController{
	private PropertySquare model;
	private PropertySquareView view;
	
	public TaxSquareController(PropertySquare model, PropertySquareView view) {
		this.model = model;
		this.view = view;
	}
	
	public int payTax() {
		int tax = 0;
		//TODO Pay 10% of player's money.
		return tax;
	}
}
