package mediator�н�;

public class ConcreteMediator extends Mediator {

	@Override
	public void componentChanged(Component component) {
		if (component == button) {
			System.out.println("����˰�ť");
			text.update();
		}else if (component == text) {
			System.out.println("�����text");
			button.update();
		}

	}

}
