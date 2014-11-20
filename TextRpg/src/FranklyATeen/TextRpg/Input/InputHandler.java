package FranklyATeen.TextRpg.Input;

import java.util.Scanner;

import FranklyATeen.TextRpg.utility.StringThings;

public class InputHandler {
	
	Scanner userInput;
	
	public InputHandler(Scanner userInput){
		this.userInput = userInput;
	}
	
	public Command getInput(){
		
		String toParse = userInput.nextLine();
		if(StringThings.contains(' ', toParse.toCharArray())){
			String command = toParse.substring(0, toParse.indexOf(" "));
			String[] args = toParse.substring(toParse.indexOf(" ")).split(" ");
			return new Command(command, args);
		
		}else{
			String command = toParse;
			return new Command(command);
		}
		
		
	}
	
	
}
