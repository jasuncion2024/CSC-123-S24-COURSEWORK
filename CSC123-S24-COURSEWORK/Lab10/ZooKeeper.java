import java.util.Scanner;
public class ZooKeeper {

	public static void main(String[] args) {
		Animal lion = new Lion("Simba", 5, 200.0);
        Animal elephant = new Elephant("Dumbo", 10, 500.0);
        
        lion.makeSound();
        elephant.makeSound();
        
        Animal genericAnimal = new Lion("Generic Lion", 3, 150.0);
        genericAnimal.makeSound();

	}

}
