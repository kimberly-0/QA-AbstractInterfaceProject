public class Main {

    public static void main(String[] args) {

        Animal[] array = {new Dog(), new Dog()};

        for (Animal a : array) {
            System.out.println(a.makeSound());
        }

        PoliceAnimal[] array2 = {new Dog(), new Horse()};

        for (PoliceAnimal p : array2) {
            System.out.println(p.makeSound() + ": " + p.dutyStatus());
        }
    }
}
