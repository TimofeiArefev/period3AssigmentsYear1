
public class TV
{
	private String brand;
	private String model;
	private int volume;
	private int channel;
	private boolean isLocked;
	private String lockCode;
	
	public TV(String brand, String model)
	{
		this.brand = brand;
		this.model = model;
		this.channel = 1;
		this.volume = 50;
		this.isLocked = false;
		this.lockCode = "0000";
	}
	
	
	public void setSaftyOn()
	{
		this.isLocked = true;
	}
	public void setSaftyOff()
	{
		this.isLocked = false;
	}
	

	public String getBrand()
	{
		return this.brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public void setMode(String model)
	{
		this.model = model;
	}
	
	public int getChannelNumber()
	{
		return this.channel;
	}
	
	public void setChannelNumber(int channel)
	{
		this.channel = channel;
	}
	
	public int getVolume()
	{
		return this.volume;
	}
	
	public void setVolume(int volume)
	{
		this.volume = volume;
	}
	
	public String getLock()
	{
		return this.lockCode;
	}
	
	public void setLock(String lockCode)
	{
		this.lockCode =  lockCode;
	}
}	