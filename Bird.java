public class Bird extends Animal {
	
	//Constructor
	public Bird(String age, String color, int weight, int minimumWeight){
		super(age, color, "Bird", weight, minimumWeight);
	}
	
	//-2
	public void fly(){
		super.setWeight(super.getWeight()-2);
	}
}