package mediator�н�;

public class Button extends Component {

	public Button(Mediator m) {
		super(m);
	}

	@Override
	public void update() {
		System.out.println("������ť");     
	}

}
