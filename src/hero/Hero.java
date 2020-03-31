package hero;

import item.base.Item;

public class Hero {
	String name;
	int hp;
	int attack;
	int defense;
	int inventorySize;
	Item[] inventory;

	public Hero(String name, int hp, int attack, int defense, int inventorySize) {

		this.hp = hp < 1 ? 1 : hp;
		inventorySize = inventorySize < 1 ? 1 : inventorySize;
		inventorySize = inventorySize > 6 ? 6 : inventorySize;
		Item[] inventory = new Item[inventorySize];
		this.inventory = inventory;
		this.attack = attack < 0 ? 0 : attack;
		this.defense = defense < 0 ? 0 : defense;
		this.inventorySize = inventorySize;
		this.name = name;
	}

	public Item[] getInventory() {
		return this.inventory.clone();
	}

	public int equipItem(Item item) throws EquipItemFailedException {
		boolean cker = true;
		int index = 0;
		for (int i = 0; i < this.inventorySize; i++) {
			if (this.inventory[i] == null) {
				this.inventory[i] = item;
				item.applyBonuses(this);
				cker = false;
				break;
			}
			index++;
		}
		if (cker == true) {
			throw new EquipItemFailedException("Hero inventory is full");
		} else {
			return index;
		}
	}

	public Item unequipItem(int slotNumber) throws UnequipItemFailedException {
		if (slotNumber < this.inventorySize) {
			if (this.inventory[slotNumber] == null) {
				throw new UnequipItemFailedException("No item in that slot");
			} else {
				Item tho = this.inventory[slotNumber];
				this.inventory[slotNumber].unapplyBonuses(this);
				this.inventory[slotNumber] = null;
				return tho;
			}
		} else {
			throw new UnequipItemFailedException("Hero does not have that many slots");
		}
	}

	@Override
	public String toString() {
		// you do NOT need to modify this method
		return new StringBuilder().append("{").append(this.getName()).append("}").append(":[").append("hp:")
				.append(this.getHp()).append(" atk:").append(this.getAttack()).append(" def:").append(this.getDefense())
				.append("] ").append("(").append(this.getInventorySize()).append(" item slots)").toString();
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getAttack() {
		return this.attack;
	}

	public int getDefense() {
		return this.defense;
	}

	public int getInventorySize() {
		return this.inventorySize;
	}

	public void setHp(int hp) {
		this.hp = hp < 1 ? 1 : hp;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}
