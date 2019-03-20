package polimorfism;


class Panther extends Feline {
	public Panther(double height, int age) {
		super(height, age);
	}
	
	@Override
	public void jump() {
		System.out.println("Пантера прыгает");
	}
}
