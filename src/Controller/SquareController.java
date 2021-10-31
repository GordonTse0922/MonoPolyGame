package Controller;

import Model.Square;
import View.SquareView;

abstract class SquareController {
	private Square model;
	private SquareView view;

	protected SquareController(Square model,SquareView view) {
		this.model = model;
		this.view =view;
	}

	public void setSquareName(String name) {
		model.setName(name);
	}
	
	public String getSquareName() {
		return model.getName();
	}
	
	public void setSquareIndex(int index) {
		model.setIndex(index);
	}
	
	public int getSquareIndex() {
		return model.getIndex();
	}
	
	public void updateView(){				
	    view.printSquareDetail(model.getName(), model.getIndex());
	}
}
