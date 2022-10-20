

public class Main {

	public static void main(String[] args) 
	{
		provider p1=new provider();
		p1.setCharges(400f);
		p1.setpName("Fecebook");
		p1.setSize(12);
		provider.discount(10);
		
		System.out.println("-----");
		AudioMsg a1=new AudioMsg (12,12,"l","j","k",p1);
		a1.showAudioDetails();
		a1.showData();
		a1.showDetails();
		//provider.discount(10);
		System.out.println("-----");
		
		
		TextMsg t=new TextMsg("k",4,"i","p","w",p1);
		t.showData();
		t.showDetails();
		t.showTextDetails();

	}

}
