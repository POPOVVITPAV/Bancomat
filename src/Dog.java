public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDog = new Dog[3];
        myDog[0] = new Dog();
        myDog[1] = new Dog();
        myDog[2] = new Dog();

        myDog[0].name = "Fred";
        myDog[1].name = "Djorg";
        System.out.println(myDog[2].name);
        myDog[2].name = "Elis";
        int x = 0;
        while (x < myDog.length) {
            myDog[x].bark();
            System.out.println(myDog[x].name);
            x++;
        }
    }
    public void bark() {
        System.out.println(name + " Сказал gaf");
    }
    public  void eat(){}
    public void chaseCat(){}
}
