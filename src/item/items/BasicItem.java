package item.items;

import hero.Hero;
import item.base.Item;

// You CAN modify the first line
public class BasicItem extends item.base.Item{
	int hpBonus;
	int attackBonus;
	int defenseBonus;
	public BasicItem(String name, String description, int hpBonus, int attackBonus, int defenseBonus) {
		super(name, description);
		this.attackBonus = attackBonus;
		this.defenseBonus = defenseBonus;
		this.hpBonus = hpBonus;
	}
	public void applyBonuses(Hero hero) {
		hero.setAttack(hero.getAttack()+this.attackBonus);
		hero.setDefense(hero.getDefense()+this.defenseBonus);
		hero.setHp(hero.getHp()+this.hpBonus);
	}
	public void unapplyBonuses(Hero hero) {
		hero.setAttack(hero.getAttack()-this.attackBonus);
		hero.setDefense(hero.getDefense()-this.defenseBonus);
		hero.setHp(hero.getHp()-this.hpBonus);
	}
}
