package intervals;

public class RightOpenedInterval extends Interval {
	
	public RightOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);				
	}
	
	public boolean includes(double value){
		return getMinimum() <= value && value < getMaximum();
	}
	
	public boolean includes(Interval interval){
		return ((this.includes(interval.getMaximum()) || (interval.getMaximum()==this.getMaximum())) && this.includes(interval.getMinimum()));
	}

}
