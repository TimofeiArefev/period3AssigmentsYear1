import java.util.ArrayList;



public class Photo
{
	private int length;
	private int width;
	private String description;
	private ArrayList<String> peopleList;
	private int dpi;
	
	public Photo(int length, int width, String description, ArrayList<String>  peopleList, int dpi)
	{
		this.length = length;
		this.width = width;
		this.description = description;
		this.peopleList = peopleList;
		this.dpi = dpi;
	}
	
	public boolean isPrintable()
	{
		return this.dpi >= 150 && this.length >= 585 && this.width >= 878;
	}	
	
	
	public boolean isGroupPhoto()
	{
		return this.peopleList.size() > 2;
	}
	
	
	public int getLength()
	{
		return this.length;
	}
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(S	tring description)
	{
		this.description = description;
	}

	public ArrayList<String> getPeopleList()
	{
		return this.peopleList;
	}
	
	public void setPeopleList(ArrayList<String> peopleList)
	{
		this.peopleList = peopleList;
	}	


	public int getDpi()
	{
		return this.dpi;
	}

	public void setDpi(int dpi)
	{
		this.dpi = dpi;
	}
	

}	