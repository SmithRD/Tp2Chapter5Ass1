package co.za.cput.ProxyPattern;

import co.za.cput.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class ProxysTest {
    private ServerInterface serv;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        serv = (Proxys)ctx.getBean("proxy");
    }

    @Test
    public void testProxyPattern() throws Exception
    {
        Assert.assertEquals("Message: words", serv.message("words"));
    }
}
