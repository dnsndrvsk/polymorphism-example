package polimorfism;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			switch (new Random().nextInt(4) % 3) {
				case 0: list.add(new Cat(110.1, 2));
				break;
				case 1: list.add(new Tiger(15.1, 3));
				break;
				case 2: list.add(new Panther(12, 3));
				break;
			}
		}
		
		for (Animal animal : list) {
			animal.jump();
		}
	}
}
