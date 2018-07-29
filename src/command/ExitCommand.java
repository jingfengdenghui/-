package command;

public class ExitCommand extends Command{
    private SystemExitClass exit = new SystemExitClass();
	@Override
	public void execute() {
		exit.display();	
	}

}
