/* Created by: James McCoy
 * Created on: 12/2/2019
 * Updated on: 
 * Version: 1.0
 * 
 * 
 * Requirements:
 * 
 * Scenario, In our game app, we have many types of monsters that can attack. We
 * shall design a superclass called Monster and define the method attack() in the
 * superclass. The subclasses shall then provides their actual implementation. In the
 * main program, we declare instances of superclass, substituted with actual
 * subclass; and invoke method defined in the superclass.
 * 
 * 
 * Input:
 * 
 * - Monster interface
 * 		-name: String
 * 		-attack (action): String
 * - FireMonster class
 * 		-attack (action): String
 * - WaterMonster class
 * 		-attack (action): String
 * - StoneMonster class
 * 		-attack (action): String
 * 
 * Output:
 * 
 * Attack with fire!
 * Attack with water!
 * Attack with stones!
 * Attack with stones!
 * !^_&^$@+%$* I don't know how to attack!
 * 
 * Process:
 * 
 * -Create Monster superclass
 * 	-define method attack()
 * 	-define method name()
 * -Create subclasses
 * 	-FireMonster
 * 	-WaterMonster
 * 	-StoneMonster
 * -Declare instances of superclass substituted with subclasses in the main class
 * 	-
 * 
 * 
 * */

package com.monstergame.main;

public class TestMonster {

	public static void main(String[] args) {
		 // Program at the "interface" defined in the superclass.
		 // Declare instances of the superclass, substituted by subclasses.
		 Monster m1 = new FireMonster("r2u2"); // upcast
		 Monster m2 = new WaterMonster("u2r2"); // upcast
		 Monster m3 = new StoneMonster("r2r2"); // upcast
		 // Invoke the actual implementation
		 System.out.println(m1.name + ": " + m1.attack()); // Run FireMonster's attack()
		 System.out.println(m2.name + ": " + m2.attack()); // Run WaterMonster's attack()
		 System.out.println(m3.name + ": " + m3.attack()); // Run StoneMonster's attack()
		 // m1 dies, generate a new instance and re-assign to m1.
		 m1 = new StoneMonster("a2b2"); // upcast
		 System.out.println(m1.name + ": " + m1.attack()); // Run StoneMonster's attack()
		 // We have a problem here!!!
		 Monster m4 = new Monster("u2u2");
		 System.out.println(m4.name + ": " + m4.attack()); // garbage!!!
		 }
		}