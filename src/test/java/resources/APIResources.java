package resources;

//enum is special class in java which has collection of constants and methods
public enum APIResources {

	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	private String resource;
	
	APIResources(String resource){
		this.resource = resource;
		System.out.println("Check");
	}
	
	public String getResource() {
		return resource;		
	}
}
