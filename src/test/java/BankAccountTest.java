import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.extractProperty;

public class BankAccountTest {

    private BankAccount bankAccount;
    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("FirstName", "LastName", LocalDate.of(2001, 2, 12), true);
    }
    @Test
    public void canGetFirstName(){
        // ARRANGE, ACT, ASSERT
        String result = bankAccount.getFirstName();
        String expected = "FirstName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
        // ARRANGE, ACT, ASSERT
        String newName = "NewFirstName";
        bankAccount.setFirstName(newName);
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo(newName);
    }


    @Test
    public void canGetLastName(){
        // ARRANGE, ACT, ASSERT
        String result = bankAccount.getLastName();
        String expected = "LastName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        // ARRANGE, ACT, ASSERT
        String newName = "NewLastName";
        bankAccount.setLastName(newName);
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo(newName);
    }


    @Test
    public void canGetDateOfBirth(){
        // ARRANGE, ACT, ASSERT
        LocalDate result = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(2001, 2, 12);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        // ARRANGE, ACT, ASSERT
        LocalDate newDOB = LocalDate.of(5000, 1, 1);
        bankAccount.setDateOfBirth(newDOB);
        LocalDate result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo(newDOB);
    }

    @Test
    public void canGetAccountType(){
        // ARRANGE, ACT, ASSERT
        boolean result = bankAccount.getAccountType();
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetAccountType(){
        // ARRANGE, ACT, ASSERT
        boolean newAccountType = false;
        bankAccount.setAccountType(newAccountType);
        boolean result = bankAccount.getAccountType();
        assertThat(result).isEqualTo(newAccountType);
    }

}
