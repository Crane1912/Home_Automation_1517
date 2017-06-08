package HAS;

public class HAS_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HAS_Factory facObj = new HAS_Factory();

	   
	      Has_Module ap1 = facObj.getAppliance("Home Lights");

	
	      ap1.ONandOFF();


	      Has_Module ap2 = facObj.getAppliance("Air Conditioner");


	      ap2.ONandOFF();


	      Has_Module ap3 = facObj.getAppliance("Washing Mechine");

	  
	      ap3.ONandOFF();

	}

}
