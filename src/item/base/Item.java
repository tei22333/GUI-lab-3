package item.base;

import hero.Hero;

// you CAN modify the first line
abstract public class Item {	
	String name;
	String description;
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String toString() {
		// You do NOT have to modify this function
		return new StringBuilder()
				.append("<")
				.append(this.getName())
				.append(">:[")
				.append(this.getDescription())
				.append("]")
				.toString();
	}
	
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	abstract public void applyBonuses(Hero hero);
	abstract public void unapplyBonuses(Hero hero);
	
}
