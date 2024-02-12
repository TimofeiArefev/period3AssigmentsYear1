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
		return (this.dpi >= 150 && this.length >= 585 && this.width >= 878 );
	}	
	
	
	public boolean isGroupPhoto()
	{
		return this.peopleList.size() > 2;
	}
	
	

}	