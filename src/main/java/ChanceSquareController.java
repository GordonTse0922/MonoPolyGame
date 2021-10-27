public class ChanceSquareController extends SquareController{

	private ChanceSquare model;
	private ChanceSquareView view;
	
	public ChanceSquareController(ChanceSquare model, ChanceSquareView view) {
		this.model = model;
		this.view = view;
	}
	
	public int randomAmount() {
		int amount = 0;
		//TODO Gain random amount up to HKD 200 (multiple of 10) or Lose random amount up to HKD 300 (multiple of 10).
		return amount;
	}
}
