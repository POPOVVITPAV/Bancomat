import java.util.Scanner;

public class Bancomat {

    Person person = new Person();
    Card  card = new Card(1234);

    public  boolean avtorization(int userInput) {// num of card input user
        int count =3;
        while (count != 0){
            System.out.println("Вы ввели не верный номер карты");
            count--;
        }
        return true;
    }

    public void displayBalance() {
        System.out.println(person.getFirstName() + " " + person.getSecondName() + " Ваш баланс: " + person.getBalance());
    }

    public void amountWithdrawi(float cash) {
        float amountWithdrawi = person.getBalance() - cash;
        System.out.println(amountWithdrawi);
    }
    public void amountDepositing(float cash) {
        float amountWithdrawi = person.getBalance() + cash;
        System.out.println(amountWithdrawi);
    }
}
