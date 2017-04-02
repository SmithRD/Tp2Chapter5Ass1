package co.za.cput.AbstractFactory;

import co.za.cput.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class AbstractFactoryTest {
    private Car car1, car2 ;
    private Motorcycle bike1;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        car1 = (Toyota) ctx.getBean("transportCar");
        car2 = (Mercedes) ctx.getBean("transport2Car");
        bike1 = (Ducati) ctx.getBean("transportMotorcycle");
    }

    @Test
    public void testGetModel() throws Exception
    {
        Assert.assertNotEquals(car1, car2);
    }

    @Test
    public void testGetType() throws Exception
    {
        Assert.assertEquals("streetfighter", bike1.getType());
    }
}
