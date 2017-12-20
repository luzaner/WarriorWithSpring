package ua.luzaner.perception.spring.impls.archer;

import ua.luzaner.perception.spring.interfaces.Vehicle;

public class ArcherVehicle implements Vehicle {

	private String boots;

	public void go() {
		System.out.println("You walk!");
	}

	public String getBoots() {
		return boots;
	}

	public void setBoots(String boots) {
		this.boots = boots;
	}
}
