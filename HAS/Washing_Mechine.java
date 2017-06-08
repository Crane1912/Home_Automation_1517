package HAS;

public class Washing_Mechine implements Has_Module{
	
	public int ONandOFF(int flag) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			flag=1;
			System.out.println("Washing mechine ON");
			return flag;
			
		}
		else
		{
			flag=0;
			System.out.println("Washing mechine  OFF");
			return flag;
		}
		
	}

}
