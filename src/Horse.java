public class Horse extends Animal implements PoliceAnimal {

    public String dutyStatus() {
        return "in service";
    }

    @Override
    public String makeSound() {
        return "Neigh";
    }
}
