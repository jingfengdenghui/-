package mediator中介;

public class ConcreteMediator extends Mediator {

	@Override
	public void componentChanged(Component component) {
		if (component == button) {
			System.out.println("点击了按钮");
			text.update();
		}else if (component == text) {
			System.out.println("点击了text");
			button.update();
		}

	}

}
