package memento±¸ÍüÂ¼;

public class Chess {
	int x;
	int y;
	String label;

	public Chess(int x, int y, String label) {
		super();
		this.x = x;
		this.y = y;
		this.label = label;
	}

	public ChessMemento save() {
		return new ChessMemento(x, y, label);
	}

	public String toString() {
		return "label=" + label + ",x=" + x + ",y=" + y;
	}
	
	public void restore(ChessMemento chessmemento) {
		this.x = chessmemento.x;
		this.y = chessmemento.y;
		this.label = chessmemento.label;
	}

}
