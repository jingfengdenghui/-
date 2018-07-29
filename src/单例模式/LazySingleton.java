package ����ģʽ;

public class LazySingleton {
	/*
	 * ע����������volatile
	 * */
    private volatile static LazySingleton instance = null;
    
    private LazySingleton() {}
    
    public static LazySingleton getInstance() {
    	// ע����������synchronizedͬ������˫��if�ж�
    	if (instance == null) synchronized(LazySingleton.class){
    		if (instance == null) {
    			instance = new LazySingleton();
    		}
    	}
    	return instance;
    }
}
