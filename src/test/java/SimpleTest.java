import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    public void UserTest() {
        long testId = 123;
        User user = new User(testId);
        Assert.assertEquals(testId, user.getId());
    }
}
