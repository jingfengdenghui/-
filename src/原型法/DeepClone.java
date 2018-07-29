package Ô­ÐÍ·¨;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepClone implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DeepClone deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bai);
		return (DeepClone) ois.readObject();	
	}

}
