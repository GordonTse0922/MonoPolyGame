abstract class Square {
	protected String name;
	protected int index;
	
	public Square(String name, int index) {
		this.name = name;
		this.index = index;
	}
	
	public Square() {
		this.name = "No Name";
		this.index = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
}
