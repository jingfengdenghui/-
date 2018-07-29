package bridge;

public abstract class Image {
	protected ImageImp imp;
	
	public Image(ImageImp imp){ imp = this.imp;}
	public abstract void parseFile(String filePath); 

}
