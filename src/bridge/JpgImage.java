package bridge;

public class JpgImage extends Image{

	public JpgImage(ImageImp imp) {
		super(imp);
	}

	@Override
	public void parseFile(String filePath) {
		// ģ��ͨ���ļ������õ�JPGͼƬ������
		int[][] imageArray =new int[28][28];
		imp.doPaint(imageArray);
	}

}
