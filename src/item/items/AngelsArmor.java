package item.items;

import hero.Hero;

// You CAN modify the first line
public class AngelsArmor extends item.base.UpgradableItem {
	String name;
	static int level;
	static int buffDEF;
	static int buffHP;
	static int buffATK;

	public AngelsArmor() {
		super("Angel's Armor", "Armor wielded by Heaven's people");
		this.name = "Angel's Armor";
		this.level = 1;
		// use the given name and description
	}

	public void applyBonuses(Hero hero) {
		if (this.level == 1) {
			hero.setDefense(hero.getDefense() + 10);
			this.buffDEF = 10;
		} else if (this.level == 2) {
			hero.setDefense(hero.getDefense() + 27);
			hero.setHp(hero.getHp() + 233);
			this.buffDEF = 27;
			this.buffHP = 233;
		} else if (this.level == 3) {
			hero.setDefense(hero.getDefense() + 46);
			hero.setHp(hero.getHp() + 326);
			hero.setAttack(hero.getAttack() + 23);
			this.buffDEF = 46;
			this.buffHP = 326;
			this.buffATK = 23;
		}
	}

	public void unapplyBonuses(Hero hero) {
		hero.setAttack(hero.getAttack() - this.buffATK);
		hero.setDefense(hero.getDefense() - this.buffDEF);
		hero.setHp(hero.getHp() - this.buffHP);
	}

	public void upgrade() {
		this.level = this.level + 1 >= 3 ? 3 : this.level + 1;
	}

	public int getUpgradeLevel() {
		return this.level;
	}
}
