package intervals;

public class RightOpenedInterval extends Interval {
	
	public RightOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);				
	}
	
	public boolean includes(double value){
		return getMinimum() <= value && value < getMaximum();
	}

}
