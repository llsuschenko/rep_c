class Animal {
    String animal_type;
    Region region;

    public static int a=55;

    Animal() {
        animal_type = "canine family";
        new Region("Spain", "subtropical");
    }

    ;


    Animal(String animal_type, Region region) {
        this.animal_type = animal_type;
        this.region = region;
    }

    void sound() {
        System.out.println("Animal's sound");
    }

    ;
}
