package co.za.cput.Adaptor;

import co.za.cput.Adapter.FloatAdapter;
import co.za.cput.Adapter.FloatClass;
import co.za.cput.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class AdaptorTest {

    private FloatAdapter adaptor;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        adaptor = (FloatClass)ctx.getBean("adapt");
    }

    @Test
    public void testAdapterTest() throws Exception
    {
        Assert.assertEquals(9.0, adaptor.adapt(), 1);
    }
}
