
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
	
	public void setLock(String lockCode)
	{
		this.isLocked = true;
		this.lockCode =  lockCode;
	}	
	
	
	public void setSaftyOn()
	{
		this.isLocked = true;
	}
	public void setSaftyOff()
	{
		this.isLocked = false;
	}
	

}	