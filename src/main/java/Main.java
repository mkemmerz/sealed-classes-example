import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal duck = new Duck();

        Animal dog = new Dog();
        Animal labrador = new Labrador();
        Animal chihuahua = new Chihuahua();

        Animal domnesticDuck = new DomesticDuck();

        List<Animal> animals = List.of(dog, cat, duck, labrador, chihuahua, domnesticDuck);

        animals.forEach(animal -> System.out.println(animal.makeSound()));
    }
}
