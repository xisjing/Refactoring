package intervals;

public class BothOpenedInterval extends Interval {	
	
	public BothOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);				
	}
	
	public boolean includes(double value){
		return getMinimum() < value && value < getMaximum();
	}
	
	public boolean includes(Interval interval){
		return ((this.includes(interval.getMinimum()) || (interval.getMinimum()==this.getMinimum()))) && ((this.includes(interval.getMaximum()) || (interval.getMaximum()==this.getMaximum())));
	}


}
