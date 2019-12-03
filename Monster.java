package com.monstergame.main;

public class Monster implements MonsterI {
	protected String name;

	public Monster(String name) {
		super();
		this.name = name;
	}

	public String attack() {
		
		return "!^_&^$@+%$* I don't know how to attack!";
	}
		

}
