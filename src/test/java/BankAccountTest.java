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
}
