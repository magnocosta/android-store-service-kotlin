/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import com.teste.start.JavaStart;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAppHasAGreeting() {
        JavaStart classUnderTest = new JavaStart();
        assertNotNull("app should have a greeting", classUnderTest.teste());
    }
}
