import org.junit.Assert;
import org.junit.Test;

/**
 * Created by latha on 7/23/15.
 */
public class TestUserIT {
    @Test
    public void testUser () {
        User user = new User ();
        user.setUserName("TestUserIT");
        Assert.assertEquals(user.getUserName(),"TestUserIT");
    }

    @Test
    public void testUser3 () {
        User user = new User ();
        user.setUserName("TestUserIT");
        Assert.assertEquals(user.getUserName(),"TestUserIT");
    }
    @Test
    public void testUser2 () {
        User user = new User ();
        user.setUserName("TestUserIT");
        Assert.assertEquals(user.getUserName(),"TestUserIT");

    }
    @Test
    public void testUser1 () {
        User user = new User ();
        user.setUserName("TestUserIT");
        Assert.assertEquals(user.getUserName(),"TestUserIT");
    }

}
