import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    // Current Account: false || Savings Account: true
    private boolean accountType;
    private int accountNumber;
    private int balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, boolean accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountType = accountType;
        this.accountNumber = 12345678;
        this.balance = 0;
    }
}
