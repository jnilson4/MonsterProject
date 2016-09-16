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
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
	}
}
