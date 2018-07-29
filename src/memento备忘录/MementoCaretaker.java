package memento±¸ÍüÂ¼;

import java.util.ArrayList;

public class MementoCaretaker {
	private ArrayList<ChessMemento> list = new ArrayList<ChessMemento>();

	public ChessMemento get(int i) {
		return list.get(i);
	}

	public void add(ChessMemento memento) {
		list.add(memento);
	}
}
