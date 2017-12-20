package ua.luzaner.perception.spring.impls.warrior;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import ua.luzaner.perception.spring.abstracts.warrior.PerfectWarrior;
import ua.luzaner.perception.spring.interfaces.Armor;
import ua.luzaner.perception.spring.interfaces.Vehicle;
import ua.luzaner.perception.spring.interfaces.Weapon;

public class Elf extends PerfectWarrior implements InitializingBean, DisposableBean {

	private String name;
	private int year;
	private boolean magicAbility;

	public Elf() {
	}

	public Elf(Weapon hand, Armor leg, Vehicle head, String name, int year, boolean magicAbility) {

		this.name = name;
		this.year = year;
		this.magicAbility = magicAbility;
	}

	public Elf(String name, int year, boolean magicAbility) {
		this.name = name;
		this.year = year;
		this.magicAbility = magicAbility;
	}

	@Override
	public void fight() {
		getVehicle().go();
		getWeapon().injure();
		getArmor().defend();

	}

	@Override
	public void run() {
		System.out.println("Elf is running!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isMagicAbility() {
		return magicAbility;
	}

	public void setMagicAbility(boolean magicAbility) {
		this.magicAbility = magicAbility;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this + " - method destroy()");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this + " - method init()");

	}

}
