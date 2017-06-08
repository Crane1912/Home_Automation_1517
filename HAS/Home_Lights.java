package HAS;

public class Home_Lights implements Has_Module{

	@Override
	public int ONandOFF(int flag) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			flag=1;
			System.out.println("Home Lights  ON");
			return flag;
		}
		else
		{
			flag=0;
			System.out.println("Home Lights OFF");
			return flag;
			
		}
		
	}

}
