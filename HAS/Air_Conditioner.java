package HAS;

public class Air_Conditioner implements Has_Module{
	
	public int  ONandOFF(int flag) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			flag=1;
			System.out.println("Ac ON");
			return flag;
		}
		else
		{
			flag=0;
			System.out.println("Ac OFF");
			return flag;
		}
		
	}

}
