package my;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RankAcademicTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //assertTrue( "Xuất sắc", RankAcademic.academic(3.6, 90));

        assertEquals("xuất sắc", RankAcademic.academic(3.6, -90));
    }
}
