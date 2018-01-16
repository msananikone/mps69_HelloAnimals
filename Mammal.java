public class Mammal extends Animal{

	//Constructor
	public Mammal(String age, String color, int weight, int minimumWeight){
		super(age, color, "Mammal", weight, minimumWeight);
	}
	
	//-1
	public void run(){
		super.setWeight(super.getWeight()-1);
	}
}