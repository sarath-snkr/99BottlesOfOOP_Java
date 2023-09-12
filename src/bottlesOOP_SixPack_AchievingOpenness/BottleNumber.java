package bottlesOOP_SixPack_AchievingOpenness;

import java.util.HashMap;
import java.util.Map;

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
    	Class<?> bottleNumberClass;
    	Map<Integer, Class<?>> bottleNumberClassMap = new HashMap<>();
    	bottleNumberClassMap.put(0, BottleNumber0.class);
    	bottleNumberClassMap.put(1, BottleNumber1.class);
    	bottleNumberClassMap.put(6, BottleNumber6.class);
    	
    	bottleNumberClass = bottleNumberClassMap.getOrDefault(number, BottleNumber.class);
    	
    	return bottleNumberClass(number); // not quite perfect but close. Basically would want to check within the map then default if not found.
    }
    
}
