abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
class NewBook extends Book
{
	void setTitle(String s)
	{
		this.title=s;
	}
}
public class Novel 
{
    public static void main(String[] args)
	{
		NewBook novel1=new NewBook(); 
		novel1.setTitle("A tale of two cities");
		System.out.println("The title is: "+novel1.getTitle());
	}

}
