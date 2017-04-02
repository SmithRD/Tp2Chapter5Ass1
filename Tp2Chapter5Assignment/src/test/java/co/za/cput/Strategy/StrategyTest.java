package co.za.cput.Strategy;

import co.za.cput.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class StrategyTest {
    private Move mover;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mover = (Fish)ctx.getBean("nemo");
    }

    @Test
    public void testStrategyTest() throws Exception
    {
        Assert.assertEquals("swim", mover.movement());
    }
}
