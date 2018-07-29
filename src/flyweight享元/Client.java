package flyweightÏíÔª;

public class Client {
	private static Chess blackChess = new BlackChess();
	private static Chess whiteChess = new WhiteChess();
	
	public static void main(String args[]) {
		blackChess.deploy(new Point(1,1));
		whiteChess.deploy(new Point(2,1));
	}
}
