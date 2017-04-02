package co.za.cput.Prototype;

import co.za.cput.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class PrototypeTest {
    private Clone one, two;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        one = (Sheep)ctx.getBean("dolly");
        two = one.copy();
    }

    @Test
    public void testPrototype() throws Exception
    {
        Assert.assertEquals(one.toString(), two.toString());
    }

    @Test
    public void testHashCodes() throws Exception
    {
        Assert.assertNotEquals(one.hashCode(), two.hashCode());
    }
}

