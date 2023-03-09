public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String breed, double weight) {
        this(breed, weight, "Perky", "Curled");
    }

    public Dog(String breed, double weight, String earShape, String tailShape) {
        super(breed, weight <  20 ? "Box" : (weight < 45 ? "House" : "Huge"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void makeNoise() {

        if (breed == "Wolf") {
            System.out.print("Ow Wooooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.print("Woof! ");
    }

    private void run() {
        System.out.print("Dog Running ");
    }

    private void walk() {
        System.out.print("Dog Walking ");
    }

    private void wagTail() {
        System.out.print("Tail Wagging ");
    }
}
