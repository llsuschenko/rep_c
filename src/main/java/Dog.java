public class Dog extends Animal implements Hunting {

    Dog() {
        super.animal_type = "Family: canines";
        whoIsHuntingTarget();
    }

    @Override
    void sound() {
        System.out.println("Sounds Like: Barkling");
    }

    public void whoIsHuntingTarget() {
        System.out.println("Hunting on: cats");
    }
}
