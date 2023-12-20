import fr.saintmartin.yohan.service.PwdGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PwgGenTest {

    @Test
    void TestsAreReady(){}

    @Test
    void generatorAcceptsAnArrayOfStringsAndReturnAString() {
        String[] usersWords = {"saucisson","voile","trompette"};
        String pwd = PwdGenerator.generatePwd(usersWords);
        assertNotNull(pwd);
        assertFalse(pwd.isBlank());
    }

    @Test
    void generatedPasswordMustBeEqualsOrGreaterThan16Characters() {
        String[] usersWords = {"saucisson","voile","trompette"};
        String pwd = PwdGenerator.generatePwd(usersWords);
        assertTrue(pwd.length()>=16);
    }
}
