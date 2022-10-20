
public class MsgService
{
	private String mSerName;
	private String ownerName;
	 provider p;
	
	MsgService(){}
	MsgService(String mName,String oName,provider p)
	{
		mSerName=mName;
		ownerName=oName;
		this.p=p;
		
	}
	public void showDetails()
	{
		System.out.println("Name of the msg service is:"+mSerName);
		System.out.println("Owner of the msg service is:"+ownerName);
		System.out.println("Name of the provider is:"+p);
		
	}
}
	class WhatsApp extends MsgService
	{
		private int version;
		private String downloads;
		
		WhatsApp(){}
		WhatsApp(int v,String d,String m,String o,provider p)
		{
			super(m,o,p);
			version=v;
			downloads=d;
		}
		public void showData()
		{
			System.out.println("version is:"+version);
			System.out.println("number of downloads are"+downloads);
		}
		
	}
	
	
	class TextMsg extends WhatsApp
	{
		private String status;
		
		TextMsg(){}
		TextMsg(String s,int v,String d,String m,String o,provider p)
		{
			super(v,d,m,o,p);
			status=s;
		}
		public void showTextDetails()
		{
		System.out.println("Status is:"+status);
		}
	}
	class AudioMsg extends WhatsApp
	{
		private int audioLevel;
		
		public AudioMsg() {}
		public AudioMsg(int a,int v,String d,String m,String o,provider p)
		{
			super(v,d,m,o,p);
			audioLevel=a;
		}
		public void showAudioDetails()
		{
			System.out.println("Audio level is"+audioLevel);
		}
	}
	


