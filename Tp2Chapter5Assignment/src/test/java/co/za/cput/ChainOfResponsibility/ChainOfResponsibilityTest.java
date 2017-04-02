package co.za.cput.ChainOfResponsibility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class ChainOfResponsibilityTest {
    private Stranger strange;

    @Before
    public void setUp() throws Exception
    {
        strange = setUpNames();
    }

    public static Stranger setUpNames()
    {
        Stranger callName1 = new Person1();
        Stranger callName2 = new Person2();
        Stranger callName3 = new Person3();

        callName1.setSuccessor(callName2);
        callName2.setSuccessor(callName3);

        return callName3;
    }

    @Test
    public void testChainOfResponsibilityTest() throws Exception
    {
        Assert.assertEquals("Yes I am John", strange.handleCall("John"));
    }
}
