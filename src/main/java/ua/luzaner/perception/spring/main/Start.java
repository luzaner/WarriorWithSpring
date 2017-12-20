package ua.luzaner.perception.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.luzaner.perception.spring.impls.warrior.Elf;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		Elf legolas = (Elf) context.getBean("Legolas");
		legolas.fight();

	}
}
