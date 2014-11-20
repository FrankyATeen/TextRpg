package FranklyATeen.TextRpg.utility;

public class StringThings {
	
	public static boolean contains(char find, char[] toSearch){
		for(char x: toSearch)
			if(x == ' ')
				return true;
			
		return false;
	}
}
