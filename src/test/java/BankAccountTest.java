import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    public void canGetFirstName(){
        // ARRANGE, ACT, ASSERT
        BankAccount bankAccount;
        bankAccount = new BankAccount("FirstName", "LastName", LocalDate.of(2001, 2, 12), true);
        String result = bankAccount.getFirstName();
        String expected = "FirstName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
        // ARRANGE, ACT, ASSERT
        BankAccount bankAccount;
        bankAccount = new BankAccount(null, "LastName", LocalDate.of(2001, 2, 12), true);
        String newName = "FirstName";
        bankAccount.setFirstName(newName);
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo(newName);
    }


    @Test
    public void canGetLastName(){
        // ARRANGE, ACT, ASSERT
        BankAccount bankAccount;
        bankAccount = new BankAccount("FirstName", "LastName", LocalDate.of(2001, 2, 12), true);
        String result = bankAccount.getLastName();
        String expected = "LastName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        // ARRANGE, ACT, ASSERT
        BankAccount bankAccount;
        bankAccount = new BankAccount("FirstName", null, LocalDate.of(2001, 2, 12), true);
        String newName = "LastName";
        bankAccount.setLastName(newName);
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo(newName);
    }


}
