package intervals;

public class UnOpenedInterval extends Interval {
	
	
	public UnOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);				
	}
	
	public boolean includes(double value){
		return getMinimum() <= value && value <= getMaximum();
	}
	
	public boolean includes(Interval interval){
		return this.includes(interval.getMinimum()) && this.includes(interval.getMaximum());
	}

}
