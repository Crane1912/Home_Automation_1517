package HAS;

public class Audio_System implements Has_Module{

	public int ONandOFF(int flag) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			flag=1;
			System.out.println("Audio System ON");
			return flag;
		
		}
		else
		{
			flag=0;
			System.out.println("Audio System OFF");
			return flag;
		}
		
	}

}
