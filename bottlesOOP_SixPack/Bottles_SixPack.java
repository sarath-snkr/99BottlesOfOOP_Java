package bottlesOOP_SixPack;
// based on 1.1.4, Shameless Green
// new requirement: say "1 six-pack" in place of "6 bottles"


public class Bottles_SixPack {
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
    
    public int successor(int number) {
    	if (number == 0) {
    		return 99;
    	} else {
    		return number-1;
    	}
    }
    public String action(int number) {
    	if (number == 0) {
    		return "Go to the store and buy some more, ";
    	} else {
    		return "Take " + pronoun(number) + " down and pass it around, ";
    	}
    }
    public String capitalize(String phrase) {
    	return phrase.substring(0,1).toUpperCase() + phrase.substring(1);
    }
    
    public String container(int number) {
    	if (number == 1) {
    		return "bottle";
    	} else {
        	return "bottles";
    	}
    }
    
    public String pronoun(int number) {
    	if (number == 1) {
    		return "it";
    	} else {
		return "one";
    	}
    }
    
    public String quantity(int number) {
    	if (number == 0) {
        	return "no more";
    	} else {
    		return Integer.toString(number);
    	}
    }
}
