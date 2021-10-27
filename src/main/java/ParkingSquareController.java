public class ParkingSquareController extends SquareController{
	private ParkingSquare model;
	private ParkingSquareView view;
	
	public ParkingSquareController(ParkingSquare model, ParkingSquareView view) {
		this.model = model;
		this.view = view;
	}
}
