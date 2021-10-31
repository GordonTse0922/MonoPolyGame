package Controller;

import Model.Capital;
import Model.PropertySquare;
import View.PropertySquareView;

public class PropertySquareController extends SquareController {
	private PropertySquare model;
	private PropertySquareView view;
	
	public PropertySquareController(PropertySquare model, PropertySquareView view) {
		super(model,view);
		this.model = model;
		this.view = view;
	}
	
	public boolean isPropertyOwned(){
		return model.isOwned();
	}

	public void setPropertyOwner(int playerId){
		model.setOwner(playerId);
	}
}