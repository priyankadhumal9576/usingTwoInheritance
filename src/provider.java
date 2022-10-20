
public class provider 
{
	private String pName;
	private float charges;
	private int size;
	static int discount;
	
	public String getpName() 
	{
		return pName;
	}
	public void setpName(String pName) 
	{
		this.pName = pName;
	}
	public float getCharges()
	{
		return charges;
	}
	public void setCharges(float charges) 
	{
		this.charges = charges;
	}
	public int getSize() 
	{
		return size;
	}
	public void setSize(int size) 
	{
		this.size = size;
	}
	public int getDiscount()
	{
		return discount;
	}
	public void setDiscount(int d)
	{
		discount=d;
	}
	public String toString()
	{
		return pName+"charges are"+charges+"size of the text is"+size+discount;
	}
	public static void discount(int d) 
	{
		d=10;
		
	}
	
	
	

}
