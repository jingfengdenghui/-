package 单例模式;

public class LazySingleton {
	/*
	 * 注意这里用了volatile
	 * */
    private volatile static LazySingleton instance = null;
    
    private LazySingleton() {}
    
    public static LazySingleton getInstance() {
    	// 注意这里用了synchronized同步，和双次if判断
    	if (instance == null) synchronized(LazySingleton.class){
    		if (instance == null) {
    			instance = new LazySingleton();
    		}
    	}
    	return instance;
    }
}
