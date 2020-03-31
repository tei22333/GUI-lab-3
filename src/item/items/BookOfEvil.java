package item.items;

import hero.Hero;

public class BookOfEvil extends item.base.UpgradableItem {
	int level;
	static int buffATK;
	String name;

	public BookOfEvil() {
		super("Book of Evil", "A book containing evil knowledges, can store infinitely many pages");
		this.level = 0;
		// use the given name and description
		this.name = "Book of Evil";
	}

	public void applyBonuses(Hero hero) {
		buffATK = 10 + (this.level)*3;
		hero.setAttack(hero.getAttack() + buffATK);
	}

	public void unapplyBonuses(Hero hero) {
		hero.setAttack(hero.getAttack() - buffATK);
	}

	public void upgrade() {
		this.level += 1;
	}

	public int getUpgradeLevel() {
		return this.level;
	}
}
