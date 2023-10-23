public class Dog extends Animal implements PoliceAnimal {

    public String dutyStatus() {
        return "in service";
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
