public class GoSquareController extends SquareController{
	private GoSquare model;
	private GoSquareView view;
	
	public GoSquareController(GoSquare model, GoSquareView view) {
		this.model = model;
		this.view = view;
	}
	
	public int gainSalary() {
		int salary = 1500;
		return salary;
	}
}
