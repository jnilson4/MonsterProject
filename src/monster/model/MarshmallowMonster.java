package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		this.name = "no name";
		this.antennaCount = -123435.32;
		this.eyeCount = -234987;
		this.legCount = -21431;
		this.noseCount = -2;
		this.hasBellyButton = false;
	}
	
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, int legCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
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
