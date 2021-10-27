abstract class SquareController {
	private Square model;
	private SquareView view;
	
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
