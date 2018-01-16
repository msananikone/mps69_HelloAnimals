public class Fish extends Animal{
	
	//Constructor
	public Fish(String age, String color, int weight, int minimumWeight){
		super(age, color, "Fish", weight, minimumWeight);
	}
	
	//-1
	public void swim(){
		super.setWeight(super.getWeight()-1);
	}
}