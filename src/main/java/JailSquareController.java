public class JailSquareController extends SquareController{
	private JailSquare model;
	private JailSquareView view;
	
	public JailSquareController(JailSquare model, JailSquareView view) {
		this.model = model;
		this.view = view;
	}
	
	public boolean goToJail() {
		boolean isToJail = true;
		//TODO Position Go To "InJail" Square.
		
		return isToJail;
	}
}
