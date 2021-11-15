package Model;

import java.util.Random;

public class ChanceSquare extends Square {
	public ChanceSquare (String name, int index) {
		super(name, index);
	}

	public int randomAmount() {
		/**
		int amount = 0;

		//TODO Gain random amount up to HKD 200 (multiple of 10) or Lose random amount up to HKD 300 (multiple of 10).
		amount = (int) (Math.round(((int)(Math.random() * 501) -300)/10.0) * 10);

		return amount;
		**/

		int amount = 10;
		//TODO Gain random amount up to HKD 200 (multiple of 10) or Lose random amount up to HKD 300 (multiple of 10).
		Random rand=new Random();
		int randomAddOrDeduct=rand.nextInt(2); //0 for add 1 for deduct
		if (randomAddOrDeduct==0){
			int randomFactor=rand.nextInt(21);
			amount*=randomFactor;
		}
		else{int randomFactor=rand.nextInt(31);
			randomFactor=0-randomFactor;
			amount*=randomFactor;}

		return amount;
	}

}
