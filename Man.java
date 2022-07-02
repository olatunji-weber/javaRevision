
public class Man {
	private String name;
    private int age;
	
	public Man(String n, int a) {
		this.name = n;
		this.age = a;
    	System.out.println("A man is created");
    }
	
	public void eat(String food){
        System.out.println(this.name + " is eating " + food);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man tunde = new Man("Tunde Idiagbon", 30);
		System.out.println("The man is " +tunde.name);
		System.out.println("And he is " + tunde.age + " years old.");
	}

}
