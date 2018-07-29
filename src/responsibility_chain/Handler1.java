package responsibility_chain;

public class Handler1 extends Handler{

	@Override
	public void handle(Request request) {
		if (request.getPrice() < 1000) {
			System.out.println("Handler1");
		}else {
			succeror.handle(request);
		}
	}

}
