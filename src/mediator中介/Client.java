package mediator÷–ΩÈ;

public class Client {
    public static void main(String args[]) {
    	Mediator m = new ConcreteMediator();
    	Button button = new Button(m);
    	Text text = new Text(m);
    	
    	m.button = button;
    	m.text = text;
    	
    	button.changed();
    }
}
