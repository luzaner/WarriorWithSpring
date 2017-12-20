package ua.luzaner.perception.spring.impls.archer;

import ua.luzaner.perception.spring.interfaces.Weapon;

public class ArcherWeapon implements Weapon {

	public void injure() {
		System.out.println("The arrow hit the target!");
	}

}
