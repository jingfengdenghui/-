package command;

public class FunctionButton {
    private  Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
    
	public void click() {
		System.out.println("Ã·Ωª∞¥≈•");
		command.execute();
	}
}
