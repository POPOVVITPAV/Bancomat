public class DogTestDrive {
    public static void main(String[] args) {
        DogDrive one = new DogDrive();
        one.setSize(70);
        DogDrive two = new DogDrive();
        two.setSize(8);
        DogDrive three = new DogDrive();
        three.setSize(35);

        one.bark();
        two.bark();
        three.bark();

        one.golas(3);
        two.golas(5);
        three.golas(8);
    }
}
