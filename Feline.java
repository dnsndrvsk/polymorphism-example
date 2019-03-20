package polimorfism;


abstract class Feline implements Animal {
	private double height;
	private int age;
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Feline(double height, int age) {
		this.height = height;
		this.age = age;
	}
}
