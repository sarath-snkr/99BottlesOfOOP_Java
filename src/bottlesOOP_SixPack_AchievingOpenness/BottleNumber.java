package bottlesOOP_SixPack_AchievingOpenness;

import java.util.ArrayList;
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
	protected ArrayList<BottleNumber> registry = new ArrayList<>();
	
	public BottleNumber(int number){
		this.number = number;
		this.register(this);
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
    
    public Boolean canHandle(int number) {
    	return true;
    }
    
    public ArrayList<BottleNumber> getRegistry(){
    	return this.registry;
    }
    
    // Simple factory responsible for choosing the proper bottleNumber class for given number
    public BottleNumber For(int number){ 
    	ArrayList<BottleNumber> registry = getRegistry();
    	for (int i = 1; i < registry.size(); i++) {
    		BottleNumber bottleNumberClass = registry.get(i);
    		if (bottleNumberClass.canHandle(number)){
    			return bottleNumberClass;
    		}
    	}
    	return new BottleNumber(number);
    	
    }
    
    public void register(BottleNumber candidate) {
    	this.registry.add(candidate);
    }
    
}
