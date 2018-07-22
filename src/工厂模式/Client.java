package 工厂模式;

public class Client {

	public static void main(String[] args) {
		Factory factory = new FileLoggerFactory();
		Logger logger = factory.factoryMethod();
		logger.writeLog();

	}

}
