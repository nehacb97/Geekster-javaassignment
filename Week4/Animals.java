public class Animals 
{
    int legs;
	String type;
	int wings;
	
	Animals()
	{
	System.out.println("ANIMALS");
	}
	Animals(int legs, String type)
	{
		
		this(4,type,0);
	}
	Animals(int legs, String type,int wings)
	{
		this.legs = legs;
		this.type = type;
		this.wings=wings;
	}
	
	public int getLegs()
     {
		return legs;
	  }
	public void setLegs(int legs) 
    {
		this.legs = legs;
	}
	public String getType() 
    {
		return type;
	}
	public void setType(String type) 
    {
		this.type = type;
	}
    public static void main(String args[])
    {
        Animals dog = new Animals();
		dog.setLegs(4);
		dog.setType("Domestic");
		System.out.println("D O G");
		System.out.println("Type :"+dog.getType()+" Number of Legs :"+dog.getLegs());

        Animals cat = new Animals();
        cat.setLegs(4);
        cat.setType("Domestic");
        System.out.println("CAT");
        System.out.println("Type :"+cat.getType()+"\n Number of legs :"+dog.getLegs());
    }
}
