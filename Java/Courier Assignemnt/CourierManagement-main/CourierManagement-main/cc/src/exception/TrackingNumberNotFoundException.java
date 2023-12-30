package exception;

@SuppressWarnings("serial")
public class TrackingNumberNotFoundException extends Exception {
	public TrackingNumberNotFoundException(long No) {
        super("Invalid Tracking Number "+No);
    }
}