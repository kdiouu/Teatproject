package teatProject;

public class AnimalDemo {
	public static void main(String[] args) {
		TestAnimals[] animals = new TestAnimals[] {new Dog("a"), new Cat("b")};

		for (TestAnimals animal : animals) {
			System.out.print(animal.getName() + ":");
			animal.talk();
		}
	}
}
