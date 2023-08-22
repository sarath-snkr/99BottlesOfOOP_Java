package bottlesOOP_BottleNumber;
// based on 1.1.4, Shameless Green
// new requirement: say "1 six-pack" in place of "6 bottles"


public class Bottles_SixPack_BottleNumber {
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
                return capitalize(quantity(number)) + " " + container(number) + " of beer on the wall, " +
                        quantity(number) + " " + container(number) + " of beer.\n" +
                        action(number) +
                        quantity(successor(number)) + " " + container(successor(number)) + " of beer on the wall.\n";
    }
    
    public String capitalize(String phrase) {
    	return phrase.substring(0,1).toUpperCase() + phrase.substring(1);
    }
    
    public int successor(int number) {
    	return new BottleNumber(number).successor();

    }
    public String action(int number) {
    	return new BottleNumber(number).action();

    }

    
    public String container(int number) {
    	return new BottleNumber(number).container();

    }
    
    public String pronoun(int number) {
    	return new BottleNumber(number).pronoun(); 

    }
    
    public String quantity(int number) {
    	return new BottleNumber(number).quantity();

    }
}
