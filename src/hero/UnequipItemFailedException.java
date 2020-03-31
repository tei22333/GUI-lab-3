package hero;

public class UnequipItemFailedException extends Exception {
	public String message;
	public UnequipItemFailedException(String message) {
		this.message = message;
	}
	// you CAN add SerialVersionID if eclipse gives you warning
}
