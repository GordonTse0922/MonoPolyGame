package Model;

public class ChanceSquare extends Square {
	public ChanceSquare (int index) {
		super("Chance", index);
	}

	public int randomAmount() {
		int amount = 0;
		//TODO Gain random amount up to HKD 200 (multiple of 10) or Lose random amount up to HKD 300 (multiple of 10).
		return amount;
	}

}
