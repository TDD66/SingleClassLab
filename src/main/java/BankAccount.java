import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    // Current Account: false || Savings Account: true
    private boolean accountType;
    private int accountNumber;
    private int balance;
    private int overdraft;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, boolean accountType, int overdraft) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountType = accountType;
        this.overdraft = overdraft;
        this.accountNumber = 12345678;
        this.balance = 0;
    }
    // Class Methods

    public void deposit(int depositAmount){
        if(depositAmount > 0){
            this.balance += depositAmount;
        }
    }

    public void withdrawal(int withdrawalAmount){
        if(this.balance - withdrawalAmount >= -overdraft && withdrawalAmount > 0){
            this.balance -= withdrawalAmount;
        }
    }

    public void payInterest(){
        if(this.accountType){
            int balanceMultiplied = this.balance * 120;
            this.balance = Math.floorDiv(balanceMultiplied, 100);
        }
        if(!this.accountType){
            int balanceMultiplied = this.balance * 110;
            this.balance = Math.floorDiv(balanceMultiplied, 100);
        }
    }

    // Getters and Setters

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newName){
        this.firstName = newName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getAccountType(){
        return this.accountType;
    }

    public void setAccountType(boolean newType){
        this.accountType = newType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }
}
