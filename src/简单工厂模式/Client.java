package 简单工厂模式;

public class Client {

	public static void main(String[] args) {
		Product concreteProduct = Factory.getProduct();
		concreteProduct.methodDiff();

	}

}
