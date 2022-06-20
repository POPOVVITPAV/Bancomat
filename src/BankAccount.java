import java.time.LocalDateTime;

public class BankAccount {
    Customer customer;
    LocalDateTime opend;
    double balance;

    public BankAccount (BankAccount account) {
        customer = new Customer(account.customer.name);
        opend = LocalDateTime.now();
        balance = 0.0d;
    }

    public BankAccount(Customer customer, LocalDateTime opend, double balance) {
        this.customer = customer;
        this.opend = opend;
        this.balance = balance;
    }

    @Override
    public String toString () {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f", customer.name, opend, balance);
    }
}
