package command;

public class Client {
    public static void main(String args[]) {
    	FunctionButton fb = new FunctionButton();
    	Command command = new HelpCommand();
    	
    	fb.setCommand(command);
    	
    	fb.click();
    }
}
