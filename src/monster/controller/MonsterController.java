package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Kroll", 2, 2, 2, 2, true);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is mine " + firstMonster);
	}
	/*
	 * monster name is Kroll
	 * has 2 antennas
	 * has 2 eyes
	 * has 2 legs
	 * has 2 noses
	 * has a belly button
	 */
}
