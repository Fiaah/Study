/*
CarService.java
F Heffernan
21Oct18
*/

public class CarService{

	//data members
	private String service;
	private String location;
	private String message;

	//Constructors
	public CarService(){
		service="";
		location="";
		message="";
		}

	//Setters
	public void setService(String service){
	this.service=service;
}

	public void setLocation(String location){
		this.location=location;
		}

	//compute
	 public void compute(){
		 if(service.equals("full")&&location.equals("blanchardstown")){
			 message="Your Service will be on Monday.";
			 }
		else if(service.equals("full")&&location.equals("stillorgan")){
			message="Your Service will be on Tuesday.";
			}
		else if(service.equals("interim")&&location.equals("blanchardstown")){
			message="Your Service will be on Wednesday.";
			}
		else if(service.equals("interim")&&location.equals("stillorgan")){
					message="Your Service will be on Thursday.";
			}
		else if(service.equals("pre-nct")&&location.equals("blanchardstown")){
					message="Your Service will be on Friday.";
			}
		else if(service.equals("pre-nct")&&location.equals("stillorgan")){
								message="Your Service will be on Saturday.";
			}
		else{
			message="That is an invlid entry, please try lower case.";
			}
		 }

	//getter
	public String getMessage(){
		return message;
		}
}
