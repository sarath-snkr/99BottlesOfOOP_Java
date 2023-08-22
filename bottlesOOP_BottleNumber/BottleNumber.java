package bottlesOOP_BottleNumber;

public class BottleNumber {
	private int number;
	
	public BottleNumber(int number){
		this.number = number;
	}
	
    public int successor() {
    	if (number == 0) {
    		return 99;
    	} else {
    		return number-1;
    	}
    }
    public String action() {
    	if (number == 0) {
    		return "Go to the store and buy some more, ";
    	} else {
    		return "Take " + pronoun() + " down and pass it around, ";
    	}
    }

    
    public String container() {
    	if (number == 1) {
    		return "bottle";
    	} else {
        	return "bottles";
    	}
    }
    
    public String pronoun() {
    	if (number == 1) {
    		return "it";
    	} else {
		return "one";
    	}
    }
    
    public String quantity() {
    	if (number == 0) {
        	return "no more";
    	} else {
    		return Integer.toString(number);
    	}
    }
}
