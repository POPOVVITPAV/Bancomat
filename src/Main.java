import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime opend =LocalDateTime.of(1988,10,10,20,00,00);
        BankAccount bankAccount1 = new BankAccount(new Customer("Vann"), opend, 100_000_000_000.0d);
        BankAccount bankAccount2 = new BankAccount(bankAccount1);
        System.out.println("___________________________________________________");
        System.out.println("Имя владельца для счета account = " + bankAccount1.customer.name);
        System.out.println("Имя владельца для счета newAccount = " + bankAccount2.customer.name);
        System.out.println("Результат выполнения кода после изменения имени владельца счета ");
        bankAccount2.customer.name = "AYYYYY";
        System.out.println("___________________________________________________");
        System.out.println("Имя владельца для счета account = " + bankAccount1.customer.name);
        System.out.println("Имя владельца для счета newAccount = " + bankAccount2.customer.name);
        System.out.println("___________________________________________________");
        bankAccount1.customer.name = "Max";
        System.out.println("Имя владельца для счета account = " + bankAccount1.customer.name);
        System.out.println("Имя владельца для счета newAccount = " + bankAccount2.customer.name);
    }
}
