package bridge;

public class JpgImage extends Image{

	public JpgImage(ImageImp imp) {
		super(imp);
	}

	@Override
	public void parseFile(String filePath) {
		// 模拟通过文件操作得到JPG图片的数组
		int[][] imageArray =new int[28][28];
		imp.doPaint(imageArray);
	}

}
