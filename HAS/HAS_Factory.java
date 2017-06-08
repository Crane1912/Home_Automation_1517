package HAS;

public class HAS_Factory {
	
	public Has_Module getAppliance(String Appliance){
	      if(Appliance == null){
	         return null;
	      }		
	      if(Appliance.equalsIgnoreCase("Home Lights")){
	         return new Home_Lights();
	         
	      } else if(Appliance.equalsIgnoreCase("Air Conditioner")){
	         return new Air_Conditioner();
	         
	      } else if(Appliance.equalsIgnoreCase("Washing_Mechine")){
	         return new Washing_Mechine();
	         
	      }else if(Appliance.equalsIgnoreCase("TV")){
		         return new TV();
		         
	      }else if(Appliance.equalsIgnoreCase("Audio_System")){
		         return new Audio_System();
	
	   }
return null;
}
}
