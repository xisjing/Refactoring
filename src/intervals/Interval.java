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

	public boolean includes(Interval interval) {
		
		switch (interval.opening){
					case LEFT_OPENED:
						return ((this.includes(interval.minimum) || (interval.minimum==this.minimum)) && this.includes(interval.maximum));
					case RIGHT_OPENED:
						return ((this.includes(interval.maximum) || (interval.maximum==this.maximum)) && this.includes(interval.minimum));
					case BOTH_OPENED:
						return ((this.includes(interval.minimum) || (interval.minimum==this.minimum))) && ((this.includes(interval.maximum) || (interval.maximum==this.maximum)));
					case UNOPENED:
						return this.includes(interval.minimum) && this.includes(interval.maximum);
				}
				return false;
	}

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
