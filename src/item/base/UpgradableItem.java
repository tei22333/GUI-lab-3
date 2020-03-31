package item.base;
// you CAN modify the first line 
abstract public class UpgradableItem extends Item {
	public UpgradableItem(String name, String description) {
		super(name, description);
	}
	
	@Override
	public String getName() {
		// you do NOT have to modify this function
		return super.getName() + " [level " + this.getUpgradeLevel() + "]";
	}
	abstract public void upgrade();
	abstract public int getUpgradeLevel();
}
