

public class BottlesSpeculativelyGeneral {
    private String noMore(int number) {
        return "No more bottles of beer on the wall, " +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n";
    }

    private String lastOne(int number) {
        return "1 bottle of beer on the wall, " +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n";
    }

    private String penultimate(int number) {
        return "2 bottles of beer on the wall, " +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n";
    }

    private String defaultVerse(int number) {
        return number + " bottles of beer on the wall, " +
                number + " bottles of beer.\n" +
                "Take one down and pass it around, " +
                (number - 1) + " bottles of beer on the wall.\n";
    }
    
    public String verse(int number) {
    	return verseFor(number);
    }
    
    public String verseFor(int number) {
        switch (number) {
            case 0:
                return noMore(number);
            case 1:
                return lastOne(number);
            case 2:
                return penultimate(number);
            default:
                return defaultVerse(number);
        }
    }

    public String verses(int finish, int start) {
        StringBuilder result = new StringBuilder();
        for (int i = finish; i >= start; i--) {
            result.append(verse(i));
            if (i != start) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public String song() {
        return verses(99, 0);
    }

    public static void main(String[] args) {
        Bottles bottles = new Bottles();
        System.out.println(bottles.song());
    }
    
    private class Verse{
    	int number;
    	String lyrics;
    	
    	Verse(int number, String lyrics){
    		this.number = number;
    		this.lyrics = lyrics;
    	}
    	private int number(){
    		return this.number;
    	}
    	private String text() {
    		return this.lyrics;
    	}
    }
}