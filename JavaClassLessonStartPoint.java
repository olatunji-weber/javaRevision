
public class JavaClassLessonStartPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human person1 = new Human("Toluwalope", 38, 50);
		Human person2 = new Human("Olayinka", 41, 79);
		
		System.out.println(person1.name  + " is " + person1.age + " years old");
		person1.eat("Chicken and Chips");
		System.out.println(person2.name  + " is " + person2.age + " years old");
		person2.eat("Tikka Chicken");
	}

}
