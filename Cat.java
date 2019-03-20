package polimorfism;


class Cat extends Feline {
	public Cat(double height, int age) {
		super(height, age);
	}
	
	@Override
	public void jump() {
		System.out.println("Кошка прыгает");
	}
}
