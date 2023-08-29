package bottlesOOP_SixPack_AchievingOpenness;

public class Bottles {
    public String song() {
        return this.verses(99, 0);
    }

    public String verses(int upper, int lower) {
        StringBuilder result = new StringBuilder();
        for (int i = upper; i >= lower; i--) {
            result.append(this.verse(i));
            if (i != lower) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public String verse(int number) {
    	BottleNumber bottleNumber = BottleNumber.For(number);
    	
                return capitalize(bottleNumber.toString()) + " of beer on the wall, " +
                		bottleNumber.toString() + " of beer.\n" +
                		bottleNumber.action() +
                		bottleNumber.successor().toString() + " of beer on the wall.\n";
    }
    
    public String capitalize(String phrase) {
    	return phrase.substring(0,1).toUpperCase() + phrase.substring(1);
    }
    
}
