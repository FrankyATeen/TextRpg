package FranklyATeen.TextRpg;

import java.util.Scanner;

import FranklyATeen.TextRpg.Input.Command;
import FranklyATeen.TextRpg.Input.InputHandler;

public class TextRpg {

	
	private static boolean playing;
	private static InputHandler input;
	
	public static void main(String[] args) {
		input = new InputHandler(new Scanner(System.in));
		play();
	}

	private static void play() {
		// TODO Auto-generated method stub
		playing = true;
		while(playing){
			Command nextCommand = input.getInput();
			selectCommand(nextCommand);
			
			
			// this is so cpu does not get overloaded
			try {	Thread.sleep(50); } catch (InterruptedException e) {/* TODO Auto-generated catch block*/ e.printStackTrace();
			}
		}
	}

	private static void selectCommand(Command nextCommand) {
		switch(nextCommand.getCommand()){
			case "quit":
					System.exit(1);
				break;
		}
	}

}
