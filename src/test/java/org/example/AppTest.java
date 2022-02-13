package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    //private static logger logger = (logger) LoggerFactory.getLogger(AppTest.class);
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    @RepeatedTest(value = 3)
    void testMy(){
        System.out.println("My ");
    }

}
