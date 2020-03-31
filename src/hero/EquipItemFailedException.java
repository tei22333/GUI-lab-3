package hero;

// you CAN modify the first line
public class EquipItemFailedException extends Exception {
	public String message;
	public EquipItemFailedException(String message){
		this.message = message;
	}
	// you CAN add SerialVersionID if eclipse gives you warning
}
