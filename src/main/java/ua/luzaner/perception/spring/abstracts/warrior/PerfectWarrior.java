package ua.luzaner.perception.spring.abstracts.warrior;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ua.luzaner.perception.spring.interfaces.Armor;
import ua.luzaner.perception.spring.interfaces.Vehicle;
import ua.luzaner.perception.spring.interfaces.Warrior;
import ua.luzaner.perception.spring.interfaces.Weapon;

public abstract class PerfectWarrior implements Warrior {

	@Autowired
	@Qualifier("archerWeapon")
	private Weapon weapon;

	@Autowired
	@Qualifier("archerArmor")
	private Armor armor;

	@Autowired
	@Qualifier("archerCarmianBoots")
	private Vehicle vehicle;

	public PerfectWarrior() {
		System.out.println(this + " - PerfectWarrior constructor()");
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
