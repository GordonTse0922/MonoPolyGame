package Controller;

import Model.JailSquare;
import View.JailSquareView;

public class JailSquareController extends SquareController {
	private JailSquare model;
	private JailSquareView view;
	
	public JailSquareController(JailSquare model, JailSquareView view) {
		super(model,view);
		this.model = model;
		this.view = view;
	}
	
	public boolean goToJail() {
		boolean isToJail = true;
		//TODO Position Go To "InJail" Model.Square.
		
		return isToJail;
	}
}
