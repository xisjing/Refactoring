package intervals;

public abstract class Interval {

	private double minimum;
	private double maximum;


	public Interval(double minimum, double maximum) {
		this.minimum = getMinimum();
		this.maximum = getMaximum();
		
	}
	
	public double getMinimum() {
	     return minimum;
	     
	}
	
	public double getMaximum(){
		 return maximum;
		
	}

	public double midPoint() {
		return (this.maximum + this.minimum) / 2;
	}
	public abstract boolean includes(double value);
	
	public abstract boolean includes(Interval interval);
	
	public boolean intersectsWith(Interval interval) {
		// TODO
		return false;
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

}
