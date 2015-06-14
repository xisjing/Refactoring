package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		
		switch (opening){
		
			case LEFT_OPENED:
				return new LeftOpenedInterval(minimum, maximum);
				
			case RIGHT_OPENED:
				return new RightOpenedInterval(minimum, maximum);
				
			case BOTH_OPENED:
				return new BothOpenedInterval(minimum, maximum);
				
			case UNOPENED:
				return new UnOpenedInterval(minimum, maximum);
				
			default:return null;
		
		}
		
	}
}
