import java.util.ArrayList;

//Test Class
public class AnimalTest {

	public static void main(String[] args) {
		
		Bird bird1 = new Bird("5", "Red", 15, 10);
		Fish fish1 = new Fish("1", "Blue", 10, 5);
		Mammal mammal1 = new Mammal("10", "White", 120, 100);
		
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		
		myAnimals.add(bird1);
		myAnimals.add(fish1);
		myAnimals.add(mammal1);
		
		bird1.eat();
		//15+1
		fish1.eat();
		//10+1
		mammal1.eat();
		//120+1
		
		bird1.fly();
		//16-2
		fish1.swim();
		//11-1
		mammal1.run();
		//121-1

		bird1.output(); //weight=14
		fish1.output(); //weight=10
		mammal1.output(); //weight=120
	}
}