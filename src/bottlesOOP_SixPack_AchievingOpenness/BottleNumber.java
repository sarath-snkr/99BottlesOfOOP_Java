package bottlesOOP_SixPack_AchievingOpenness;

/**
 * While BottleNumber methods originally held conditionals that checked to see if number was 0 or 1, 
 * we simplify by creating separate classes for the 'true' branch and adding a simple factory in Bottles for the logic. 
 * @author dseiter
 *
 */
public class BottleNumber {
	protected int number;
	
	public BottleNumber(int number){
		this.number = number;
	}
	
    public BottleNumber successor() {
    		return For(this.number-1);
    }
    
    public String action() {
    		return "Take " + pronoun() + " down and pass it around, ";
    }
    
    public String container() {
        	return "bottles";
    }
    
    public String pronoun() {
  		return "one";
    }
    
    public String quantity() {
    		return Integer.toString(this.number);
    }
    
    public String toString() {
    	return quantity() + " " + container(); 
    }
    
    // Simple factory responsible for choosing the proper bottleNumber class for given number
    public static BottleNumber For(int number){ 
    	BottleNumber bottleNumberClass;
    	switch (number) {
    	case 0:
    		bottleNumberClass = new BottleNumber0(number);
    		break;
    	case 1:
    		bottleNumberClass = new BottleNumber1(number);
    		break;
    	case 6:
    		bottleNumberClass = new BottleNumber6(number);
    		break;
    	default:
    		bottleNumberClass = new BottleNumber(number);
    		break;

    	}
    	
    	return bottleNumberClass;
    }
}
