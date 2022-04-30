
public class Human {
	public String name;
	public int age;
	public double weight;
	
	public Human(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println(this.name + " is created.");
	}
	
	public void eat(String food) {
		System.out.println(this.name + " is eating " + food);
	}
}
