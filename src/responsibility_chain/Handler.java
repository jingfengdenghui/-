package responsibility_chain;

public abstract class Handler {
    protected Handler succeror;

	public void setSucceror(Handler succeror) {
		this.succeror = succeror;
	}
    
   public abstract void handle(Request request);
}
