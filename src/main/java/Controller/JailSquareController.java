package Controller;

import Model.JailSquare;
import View.JailSquareView;

public class JailSquareController extends SquareController {
	private JailSquare model;
	private JailSquareView view;
	
	public JailSquareController(JailSquare model, JailSquareView view) {
		super(model,view);
	}
	
	public boolean callGoToJail() {
		return model.goToJail();
	}
}
