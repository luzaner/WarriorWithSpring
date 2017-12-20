package ua.luzaner.perception.spring.impls.horseman;

import ua.luzaner.perception.spring.interfaces.Vehicle;

public class HorseManVehicle implements Vehicle {

	private String horse;

	public void go() {
		System.out.println("You are riding!!!");
	}

	public String getHorse() {
		return horse;
	}

	public void setHorse(String horse) {
		this.horse = horse;
	}

}
