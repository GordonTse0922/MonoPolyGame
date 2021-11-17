package Controller;

import Model.ParkingSquare;
import View.ParkingSquareView;

public class ParkingSquareController extends SquareController {
	private ParkingSquare model;
	private ParkingSquareView view;
	
	public ParkingSquareController(ParkingSquare model, ParkingSquareView view) {
		super(model,view);
		this.model = model;
		this.view =view;
	}

	public void printFreeParking(){
		view.printFreeParking();
	}
}
