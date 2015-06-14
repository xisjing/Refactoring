package intervals;

public class BothOpenedInterval extends Interval {	
	
	public BothOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);				
	}
	
	public boolean includes(double value){
		return getMinimum() < value && value < getMaximum();
	}


}
