package HAS;

public class TV implements Has_Module{

	int vol=10;
	int ch=0;
	 int flag=0;
	public int ONandOFF(int flag) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			flag=1;
			System.out.println("Tv ON");
			return flag;
		}
		else
		{
			flag=0;
			System.out.println("Tv OFF");
			return flag;
		}
		
		
	}
	
	public int volUp()
	{
		if(this.vol<100 && this.vol>=0)
		{
		this.vol=this.vol+1;
		}
		return this.vol;
	}
	
	public int volDown()
	{
		if(this.vol<100 && this.vol>=0)
		{
		this.vol=this.vol-1;
		}
		return this.vol;
	}
	
	public int channelUp()
	{
		if(this.ch<100 && this.ch>=0)
		{
		this.ch=this.ch+1;
		}
		return this.ch;
	}

	public int channelDown()
	{
		if(this.ch<100 && this.ch>=0)
		{
		this.ch=this.ch-1;
		}
		return this.ch;
	}
}
