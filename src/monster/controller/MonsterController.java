package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Kroll", 2, 2, 2, 2, true);
		keyboardInput = new Scanner(System.in);
		
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is mine " + firstMonster);
		System.out.println("My monster has this many antennas " + firstMonster.getAntennaCount());
		System.out.println("My monster has this many eyes " + firstMonster.getEyeCount());
		System.out.println("My monster has this many legs " + firstMonster.getLegCount());
		System.out.println("My monster has this many noses " + firstMonster.getNoseCount());
		System.out.println("Does my monster have a belly button? " + firstMonster.getHasBellyButton());
		
		//Name
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want the name to be???");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		} else {
			System.out.println("I get to keep my name! :D");
		}
		
		System.out.println(firstMonster);
		
		//AntennaCount
		
		System.out.println("Do you want to change how many antennas I have?");
		String antennaAnswer = keyboardInput.nextLine();
		
		if (antennaAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("How many antennas do you want me to have?");
			int newAntennaCount = keyboardInput.nextInt();
			firstMonster.setAntennaCount(newAntennaCount);
		} else {
			System.out.println("I get to keep all my antennas! :D");
		}
		
		System.out.println(newAntennaCount);
		
		//EyeCount
		
		System.out.println("Do you want to change how many eyes I have?");
		String eyeCount = keyboardInput.nextLine();
		
		
	}
}



