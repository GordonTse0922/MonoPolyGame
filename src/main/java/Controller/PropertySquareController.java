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
		this.view =view;
	}
	
	public boolean isPropertyOwned(){
		return model.isOwned();
	}

	public void setPropertyOwner(int playerId){
		model.setOwner(playerId);
	}

	public int getPropertyOwner(){
		return model.getOwner();
	}

	public int getPropertyCost() {
		return model.getCost();
	}

	public int getPropertyRent() {
		return model.getRent();
	}

	public String getColorBand(){
		return model.getColorBand();
	}

	public void printPayRent(){
		String propertyName = getSquareName();
		int owner = getPropertyOwner();
		int rent = getPropertyRent();
		view.printPayRent(propertyName, owner, rent);
	}

	public void printBuyProperty() {
		String propertyName = getSquareName();
		int propertyCost = getPropertyCost();
		view.printBuyProperty(propertyName, propertyCost);
	}

	public void printYourProperty(){
		String propertyName = getSquareName();
		view.printYourProperty(propertyName);
	}
}