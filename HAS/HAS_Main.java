package HAS;

public class HAS_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		int flag2=1;
		HAS_Factory facObj = new HAS_Factory();

	   
	      Has_Module ap1 = facObj.getAppliance("Home Lights");

	
	      ap1.ONandOFF(flag);


	      Has_Module ap2 = facObj.getAppliance("Air Conditioner");


	      ap2.ONandOFF(flag);


	      Has_Module ap3 = facObj.getAppliance("Washing Mechine");

	  
	     ap3.ONandOFF(flag);
	      
	      
	      Has_Module ap4 = facObj.getAppliance("TV");

		  
	      ap4.ONandOFF(flag);
	   
	      
	      TV t1 = new TV();
	      int vol=t1.volUp();
	      System.out.print("Volume:"+vol);
	      int ch=t1.channelUp();
	      System.out.println('\n');
	      System.out.print("VolChannel:"+ch);   
	      ap4.ONandOFF(flag2);
	     


	}

}
