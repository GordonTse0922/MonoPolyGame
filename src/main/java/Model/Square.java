package Model;

public abstract class Square {
	private String name;
	private int index;
	
	public Square(String name, int index) {
		this.name = name;
		this.index = index;
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


