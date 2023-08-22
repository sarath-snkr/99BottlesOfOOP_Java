package bottlesOOP;

import java.util.ArrayList;
import java.util.List;

public class Bottles {
	public String verse(int n) {
		String nString = Integer.toString(n);
		String finalVerse = Integer.toString(n-1);
		
		
		if (n == 2) {
			return(nString + " bottles of beer on the wall, " +
					nString + " bottles of beer.\n" +
					"Take one down and pass it around, " +
					"1 bottle of beer on the wall.\n");
		}		
		else if (n == 1) {
			return(nString + " bottle of beer on the wall, " +
					nString + " bottle of beer.\n" +
					"Take it down and pass it around, " +
					"no more bottles of beer on the wall.\n");
		}
		else if (n == 0) {
			return("No more bottles of beer on the wall, " +
					"no more bottles of beer.\n" +
					"Go to the store and buy some more, " +
					"99 bottles of beer on the wall.\n");
		}
		return(nString + " bottles of beer on the wall, " +
		nString + " bottles of beer.\n" +
		"Take one down and pass it around, " +
		finalVerse + " bottles of beer on the wall.\n");	
	}
	
	public String verses(int nStart, int nEnd) {
		StringBuilder verses = new StringBuilder();
		for(int i=nStart; i>=nEnd; i--) {
			verses.append(verse(i));
			if(i!=nEnd)
				verses.append("\n");
		}
		return verses.toString();
	}

	public String song() {
		return verses(99,0);
	}	

    public static void main(String[] args) {
        Bottles bottles = new Bottles();
        System.out.println(bottles.song());
    }
}