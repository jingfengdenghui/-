package facade外观;

public class CipherMachine {
    public String encrypt(String plainText){
    	// 模拟加密算法
    	return plainText.toUpperCase();
    }
}
