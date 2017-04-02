package co.za.cput.Visitor;

import co.za.cput.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class VisitorTest {

    private GirlfriendVisitor visit;
    private BlondeGirlfriend blonde;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        visit = (GirlfriendVisitorImpl)ctx.getBean("girlfriend");
        blonde = (BlondeGirlfriend) ctx.getBean("blondie");
    }

    @Test
    public void testVisitorTest() throws Exception
    {
        Assert.assertEquals("Jennifer", visit.visit(blonde));
    }
}
