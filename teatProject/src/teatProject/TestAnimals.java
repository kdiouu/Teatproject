package teatProject;

public abstract class TestAnimals {
	private String name;

	public TestAnimals(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void talk();

	public abstract void eat();

	public abstract void mate(TestAnimals animals);
}
