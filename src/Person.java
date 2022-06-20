public class Person {
    private String firstName;
    private String secondName;
    private float balance;
    Card card;
    public Person() {

    }

    public Person (String firstName, String secondName, float balance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int cardPerson() {
        int cardP = card.codeGeneration();
        return cardP;
    }
}
