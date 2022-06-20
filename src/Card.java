public class Card {

    private int id;
    private int pin;

    public Card (int pin) {
        this.pin = pin;
    }
    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        // реализовать проверку на 4 цифры через цикл
        this.pin = pin;
    }
    public int codeGeneration() {
        id = (int) (Math.random() * 1000);
        id = 456237748 + id;
        return id;
    }
}

