package polimorfism;


class Tiger extends Feline {
	public Tiger(double height, int age) {
		super(height, age);
	}
	
	@Override
	public void jump() {
		System.out.println("Тигр прыгает");
	}
}
