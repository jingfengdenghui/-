package memento����¼;

public class Client {
	private static int index = -1;
	private static MementoCaretaker mc = new MementoCaretaker();

	public static void main(String args[]) {
		Chess chess = new Chess(1, 1, "��");
		play(chess);
		chess.y=5;
		play(chess);
		undo(chess);
		redo(chess);
		
	}

	public static void play(Chess chess) {
		mc.add(chess.save());
		index++;
		System.out.println(chess);
	}

	public static void undo(Chess chess) {
        System.out.println("����");
        index--;
        chess.restore(mc.get(index));
        System.out.println(chess);
	}
	
	public static void redo(Chess chess) {
		 System.out.println("��������");
		 index++;
		 chess.restore(mc.get(index));
		 System.out.println(chess);
	}

}
