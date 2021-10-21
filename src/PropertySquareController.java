public class PropertySquareController extends SquareController{
	private PropertySquare model;
	private PropertySquareView view;
	
	public PropertySquareController(PropertySquare model, PropertySquareView view) {
		this.model = model;
		this.view = view;
	}
	
	public boolean isPropertyOwned(){
		return model.isOwned();
	}

	public void setPropertyOwner(){
		model.setOwner();
	}
}