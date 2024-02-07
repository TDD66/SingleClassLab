import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;
    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("FirstName", "LastName", LocalDate.of(2001, 2, 12), true, 0);
    }

    @Test
    public void testPositiveDeposit(){
        // ARRANGE, ACT, ASSERT
        int depositAmount = 50;
        int originalBalance = bankAccount.getBalance();
        bankAccount.deposit(depositAmount);
        int newBalance = bankAccount.getBalance();
        int result = newBalance - originalBalance;
        assertThat(result).isEqualTo(depositAmount);
    }

    @Test
    public void testNegativeDeposit(){
        // ARRANGE, ACT, ASSERT
        int depositAmount = -50;
        int originalBalance = bankAccount.getBalance();
        bankAccount.deposit(depositAmount);
        int newBalance = bankAccount.getBalance();
        assertThat(newBalance).isEqualTo(originalBalance);
    }
    @Test
    public void testGetFirstName(){
        // ARRANGE, ACT, ASSERT
        String result = bankAccount.getFirstName();
        String expected = "FirstName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetFirstName(){
        // ARRANGE, ACT, ASSERT
        String newName = "NewFirstName";
        bankAccount.setFirstName(newName);
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo(newName);
    }


    @Test
    public void testGetLastName(){
        // ARRANGE, ACT, ASSERT
        String result = bankAccount.getLastName();
        String expected = "LastName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetLastName(){
        // ARRANGE, ACT, ASSERT
        String newName = "NewLastName";
        bankAccount.setLastName(newName);
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo(newName);
    }


    @Test
    public void testGetDateOfBirth(){
        // ARRANGE, ACT, ASSERT
        LocalDate result = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(2001, 2, 12);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetDateOfBirth(){
        // ARRANGE, ACT, ASSERT
        LocalDate newDOB = LocalDate.of(5000, 1, 1);
        bankAccount.setDateOfBirth(newDOB);
        LocalDate result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo(newDOB);
    }

    @Test
    public void testGetAccountType(){
        // ARRANGE, ACT, ASSERT
        boolean result = bankAccount.getAccountType();
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetAccountType(){
        // ARRANGE, ACT, ASSERT
        boolean newAccountType = false;
        bankAccount.setAccountType(newAccountType);
        boolean result = bankAccount.getAccountType();
        assertThat(result).isEqualTo(newAccountType);
    }

    @Test
    public void testGetAccountNumber(){
        // ARRANGE, ACT, ASSERT
        int result = bankAccount.getAccountNumber();
        int expected = 12345678;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetAccountNumber(){
        // ARRANGE, ACT, ASSERT
        int newAccountNumber = 999;
        bankAccount.setAccountNumber(newAccountNumber);
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(newAccountNumber);
    }

    @Test
    public void testGetBalance(){
        // ARRANGE, ACT, ASSERT
        int result = bankAccount.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetBalance(){
        // ARRANGE, ACT, ASSERT
        int newBalance = 100000;
        bankAccount.setBalance(newBalance);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(newBalance);
    }

    @Test
    public void testGetOverdraft(){
        // ARRANGE, ACT, ASSERT
        int result = bankAccount.getOverdraft();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetOverdraft(){
        // ARRANGE, ACT, ASSERT
        int newOverdraft = 123121;
        bankAccount.setOverdraft(newOverdraft);
        int result = bankAccount.getOverdraft();
        assertThat(result).isEqualTo(newOverdraft);
    }
}
