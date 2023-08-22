package bottlesOOP_TDD;
/*
 * API:
 * verse(n) // returns verse for given n of bottles
 * verses(upper, lower) // returns verses ranging from the upper number to lower number of bottles
 * song() // returns all verses of the song, starting from 99 and ending at 0.
 */

public class Bottles_TDD {

	public String verse(int i) {
		switch (i) {
		case 0:
			return ("No more bottles of beer on the wall, " +
	                "no more bottles of beer.\n" +
	                "Go to the store and buy some more, " +
	                "99 bottles of beer on the wall.\n");
		case 1:
			return ("1 bottle of beer on the wall, " +
					"1 bottle of beer.\n" +
					"Take it down and pass it around, " +
					"no more bottles of beer on the wall.\n");
		case 2:
			return ("2 bottles of beer on the wall, " +
					"2 bottles of beer.\n" +
					"Take one down and pass it around, " +
					"1 bottle of beer on the wall.\n");
		default:
			return (Integer.toString(i) + " bottles of beer on the wall, " +
					Integer.toString(i)+ " bottles of beer.\n" +
					"Take one down and pass it around, " +
					Integer.toString(i-1) + " bottles of beer on the wall.\n");
		}
	}
	public String verses(int upper, int lower) {
		StringBuilder verses = new StringBuilder();
		for (int iter = upper; iter >= lower; iter --) {
			verses.append(verse(iter));
			if(iter!=lower)
				verses.append("\n");
		}
		return verses.toString();
	}
	public String song() {
		return verses(99,0);
	}
}
