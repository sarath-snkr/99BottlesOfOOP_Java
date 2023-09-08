package bottlesOOP_SixPack_AchievingOpenness;

public class BottleNumber1 extends BottleNumber{

	public BottleNumber1(int number) {
		super(number);
		super.register(this);
	}
	
    @Override
    public String container() {
    		return "bottle";
    }
    
    @Override
    public String pronoun() {
    		return "it";
    }
    
    @Override
    public Boolean canHandle(int number) {
    	return number == 1;
    }
}
