public class Cat extends Animal implements Hunting {
    Cat() {
        super.animal_type = "Family: cats";
        whoIsHuntingTarget();
    }

    @Override
    void sound() {
        System.out.println("Sounds Like: Meowing");
    }

    public void whoIsHuntingTarget() {
        System.out.println("Hunting on: sparrows");
    }
}
