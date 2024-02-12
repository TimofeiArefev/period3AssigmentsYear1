import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
	{

		Book alex_casey = new Book("Alex Casey", "Alan Wake", 10, false , 256);
		System.out.println(alex_casey.getPagesFinished());

		ArrayList<String> peopleList = new ArrayList<>();
        peopleList.add("Frisk");
		
		Photo myPhoto = new Photo(8000, 8000, "this is you", peopleList, 500);
		
		System.out.println(myPhoto.isPrintable());
		
		
	}
}