public class Animal {

    protected String breed;
    private String shape ;
    private double weight;

    public Animal() {

    }

    public Animal(String breed, String shape, double weight) {
        this.breed = breed;
        this.shape = shape;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", shape='" + shape + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(breed + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(breed + " makes some kind of noise");
    }
}
