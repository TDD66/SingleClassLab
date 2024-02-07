import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BankAccountTest {

    @Test
    public void canGetFirstName(){
        // ARRANGE, ACT, ASSERT
        BankAccount bankAccount;
        bankAccount = new BankAccount("FirstName", "LastName", LocalDate.of(2001, 2, 12), true);
    }
}
