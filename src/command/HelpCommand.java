package command;

public class HelpCommand extends Command {
    private SystemHelpClass help = new SystemHelpClass();
	@Override
	public void execute() {
		help.display();
	}

}
