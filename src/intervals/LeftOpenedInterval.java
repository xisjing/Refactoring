package intervals;

public class LeftOpenedInterval extends Interval {
	
	public LeftOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);				
	}
	
	public boolean includes(double value){
		return getMinimum() < value && value <= getMaximum();
	}
	
	public boolean includes(Interval interval){
		return ((this.includes(interval.getMinimum()) || (interval.getMinimum()==this.getMinimum())) && this.includes(interval.getMaximum()));
	}
	
}
