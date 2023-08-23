

public class BottleNumber {
	private int number;
	
	public BottleNumber(int number){
		this.number = number;
	}
	
    public int successor() {
    	if (this.number == 0) {
    		return 99;
    	} else {
    		return this.number-1;
    	}
    }
    public String action() {
    	if (this.number == 0) {
    		return "Go to the store and buy some more, ";
    	} else {
    		return "Take " + pronoun() + " down and pass it around, ";
    	}
    }

    
    public String container() {
    	if (this.number == 1) {
    		return "bottle";
    	} else {
        	return "bottles";
    	}
    }
    
    public String pronoun() {
    	if (this.number == 1) {
    		return "it";
    	} else {
		return "one";
    	}
    }
    
    public String quantity() {
    	if (this.number == 0) {
        	return "no more";
    	} else {
    		return Integer.toString(this.number);
    	}
    }
}
