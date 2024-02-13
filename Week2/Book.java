public class Book 
{
	private String bookName;
	private String author;
	private int price;
	private boolean hardCover;
	private int numberOfPages;
	private int pagesFinished; 
	
	public Book(String bookName, String author, int price, boolean hardCover, int numberOfPages)
	{
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.hardCover = hardCover;
		this.numberOfPages = numberOfPages;
		this.pagesFinished = 0;
	}		
	
	public void read() 
	{
		this.pagesFinished ++; 
	}
	
	public double getReadTime()
	{
		return this.numberOfPages * 0.8;
	}	
	
	public String readingRecomendation() 
	{
        double readingTime = this.getReadTime();
        if (readingTime <= 60) 
		{
            return "You can read this";
        } 
		else if (readingTime <= 240) 
		{
            return "Are you sure you want to read this now?";
        }
        return "You should not start reading this right now";
    }	




	public String getBookName() 
	{
        return bookName;
    }

    public void setBookName(String bookName) 
	{
        this.bookName = bookName;
    }

    public String getAuthor() 
	{
        return author;
    }

    public void setAuthor(String author) 
	{
        this.author = author;
    }

    public int getPrice() 
	{
        return price;
    }

    public void setPrice(int price) 
	{
        this.price = price;
    }

    public boolean isHardCover() 
	{
        return hardCover;
    }

    public void setHasHardCover(boolean hardCover) 
	{
        this.hardCover = hardCover;
    }

    public int getNumberOfPages() 
	{
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) 
	{
        this.numberOfPages = numberOfPages;
    }

    public int getPagesFinished() 
	{
        return pagesFinished;
    }

    public void setPagesFinished(int pagesFinished) 
	{
        this.pagesFinished = pagesFinished;
    }
}
