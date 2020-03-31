package item.items;

import hero.Hero;

// You CAN modify the first line
public class RingOfHealth extends item.base.Item {
	static int buffHp;
	int hpPercentageBonus;
	public RingOfHealth(int hpPercentageBonus) {
		// use the given name and description
		super("Orb of Health (+" + hpPercentageBonus + "%)", "increase hp by " + hpPercentageBonus + "%");
		this.hpPercentageBonus = hpPercentageBonus;
	}

	public void applyBonuses(Hero hero) {
		buffHp = hero.getHp() * this.hpPercentageBonus / 100;
		hero.setHp(hero.getHp() + buffHp);
	}

	public void unapplyBonuses(Hero hero) {
		hero.setHp(hero.getHp() - buffHp);
	}
}
