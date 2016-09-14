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
	
	public String toString()
	{
		String description = "Monster says: Name is " + name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getLegCount()
	{
		return legCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public double getAntennaCount()
	{
		return antennaCount;
	}
}