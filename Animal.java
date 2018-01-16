public class Animal {

    private String age;
    private String color;
    private String type;
    private int weight;
    private int minimumWeight;

    //Constructor
    public Animal(String age, String color, String type, int weight, int minimumWeight)
    {
        this.age = age;
        this.color = color;
        this.type = type;
        this.weight = weight;
        this.minimumWeight = minimumWeight;
    }

    public void eat()
    {
        weight = weight+1;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void setWeight (int weight)
    {
    	if(weight < minimumWeight) {
    		this.weight = minimumWeight;
    		System.out.println("Too light. Setting weight to minimum weight..");
    	} else {
    		this.weight = weight;
    	}
    }

    public void output(){
        System.out.println("\nThis animal's type is " + type + "\tAge: " + age + "\tColor: " + color + "\tWeight: " + getWeight() + "\tminimumWeight: " + minimumWeight);
    }
}