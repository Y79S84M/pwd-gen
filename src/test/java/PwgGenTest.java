import fr.saintmartin.yohan.service.PwdGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PwgGenTest {

    static final String[] usersInput = {"saucisson","Institution","trompette"};
    @Test
    void TestsAreReady(){}

    @Test
    void generatorAcceptsAnArrayOfStringsAndReturnAString() {
        String pwd = PwdGenerator.generatePwd(usersInput);
        assertNotNull(pwd);
        assertFalse(pwd.isBlank());
    }

    @Test
    void generatedPasswordMustBeEqualsOrGreaterThan16Characters() {
        String pwd = PwdGenerator.generatePwd(usersInput);
        assertTrue(pwd.length()>=16);
    }

    @Test
    void generatedPasswordMustLesserThan26characters() {
        String pwd = PwdGenerator.generatePwd(usersInput);
        assertTrue(pwd.length()<26);
    }
}
