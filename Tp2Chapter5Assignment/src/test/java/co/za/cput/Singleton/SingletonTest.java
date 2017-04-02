package co.za.cput.Singleton;

import co.za.cput.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class SingletonTest {

    private Dog rover, fido;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        rover = (Dog) ctx.getBean("dog");
        fido = (Dog) ctx.getBean("dog");
    }

    @Test
    public void testSingleton() throws Exception{
        Assert.assertEquals(rover.hashCode(), fido.hashCode());
    }
}
