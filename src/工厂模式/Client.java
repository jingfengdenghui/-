package ����ģʽ;

public class Client {

	public static void main(String[] args) {
		Factory factory = new FileLoggerFactory();
		Logger logger = factory.factoryMethod();
		logger.writeLog();

	}

}
