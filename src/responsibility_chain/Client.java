package responsibility_chain;

public class Client {

	public static void main(String[] args) {
		Handler handler1 = new Handler1();
		Handler handler2 = new Handler2();
		handler1.setSucceror(handler2);
        
		handler1.handle(new Request(5000));
		
	}

}
