package co.za.cput.Bridge;

import co.za.cput.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class BridgeTest {

    private Abstraction abs;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        abs = (Abstraction)ctx.getBean("bridge");
    }

    @Test
    public void testBridgeTest() throws Exception
    {
        Assert.assertEquals("hard fruit", abs.types());
    }

}
