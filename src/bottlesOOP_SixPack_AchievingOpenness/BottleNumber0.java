package bottlesOOP_SixPack_AchievingOpenness;

public class BottleNumber0 extends BottleNumber {

	public BottleNumber0(int number) {
		super(number);
		super.register(this);
	}
    @Override
    public String quantity() {
        	return "no more";
    }
    
    @Override
    public BottleNumber successor() {
    		return BottleNumber.For(99);
    }
    
    @Override
    public String action() {
    		return "Go to the store and buy some more, ";
    }
    
    @Override
    public Boolean canHandle(int number) {
    	return number == 0;
    }

}
