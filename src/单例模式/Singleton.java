package µ¥ÀýÄ£Ê½;

public class Singleton {
	private Singleton() {}
	
	private static class HolderClass{
		private  static Singleton instance = new Singleton();
	}
    
	public static Singleton getInstance() {
		return HolderClass.instance;
	}
}
