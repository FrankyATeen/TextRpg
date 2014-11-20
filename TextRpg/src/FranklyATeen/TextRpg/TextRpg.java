package FranklyATeen.TextRpg;

public class TextRpg {

	
	private static boolean playing;
	
	public static void main(String[] args) {
		play();
	}

	private static void play() {
		// TODO Auto-generated method stub
		playing = true;
		while(playing){
			
			
			
			
			// this is so cpu does not get overloaded
			try {	Thread.sleep(50); } catch (InterruptedException e) {/* TODO Auto-generated catch block*/ e.printStackTrace();
			}
		}
	}

}
