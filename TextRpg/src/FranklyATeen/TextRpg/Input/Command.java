package FranklyATeen.TextRpg.Input;

public class Command {
	
	private String command;
	private String[] args;
	private boolean hasArgs;
	
	
	public Command(String command){
		this.command = command;
		this.args = null;
		this.hasArgs = false;
	}
	
	public Command (String command, String[] args){
		this.command = command;
		this.args = args;
		this.hasArgs = true;
	}
	
	public String getCommand(){
		return command;
	}
	
	public String[] getArgs(){
		return args;
	}
	
	public boolean hasCommandArgs(){
		return hasArgs;
	}
}
