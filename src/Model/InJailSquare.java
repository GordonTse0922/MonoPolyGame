package Model;

import Model.Square;

import java.util.Scanner;

public class InJailSquare extends Square {
	public InJailSquare (String name, int index) {
		super(name, index);
	}
	
	Scanner in = new Scanner(System.in);
	
	public InJailSquare () {
		super();
	}

}
