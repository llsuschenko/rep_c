import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("canine family", new Region("Austria", "Moderate"));

        System.out.println("Counrty of residence: " + animal.region.country);

        System.out.println();

        printTheAnimalType(new Dog());

        System.out.println();

        printTheAnimalType(new Cat());

        Date currentDate = new Date();

        printTheAnimalType(new Cat(), currentDate);

        Hunting z;
        int d = Hunting.k;

        Animal q = new Animal();

       // Animal.a=33;

        q.a=22;

        System.out.println("q=" + q.a);

        System.out.println("goodNight!");
    }

    static void printTheAnimalType(Animal animal) {

        System.out.println(animal.animal_type);
        animal.sound();
    }

    static void printTheAnimalType(Animal animal, Date date) {
        System.out.println(animal.animal_type);
        animal.sound();
        System.out.println(date);
    }

}