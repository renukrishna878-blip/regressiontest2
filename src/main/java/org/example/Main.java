package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Main{
    @Test
    public void testfail()
    {
        assertEquals("Fail"+check(35));
    }
    @Test
    public void testpass50()
    {
        assertEquals("pass"+check(50));
    }
    @Test
    public void testpass75()
    {
        assertEquals("pass"+check(75));
    }
    @Test
    public void testpass100()
    {
        assertEquals("pass"+check(100));
    }
}