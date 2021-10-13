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
        /*
        * Kiểm thử giá trị biên
        */
        assertEquals("Input không hợp lệ", RankAcademic.academic(2.0, -1));
        assertEquals("Yếu", RankAcademic.academic(2.0, 0));
        assertEquals("Yếu", RankAcademic.academic(2.0, 1));
        assertEquals("Trung bình", RankAcademic.academic(2.0, 99));
        assertEquals("Trung bình", RankAcademic.academic(2.0, 100));
        assertEquals("Input không hợp lệ", RankAcademic.academic(2.0, 101));
        assertEquals("Trung bình", RankAcademic.academic(2.0, 50));
        assertEquals("Input không hợp lệ", RankAcademic.academic(-0.01, 50));
        assertEquals("Kém", RankAcademic.academic(0, 50));
        assertEquals("Kém", RankAcademic.academic(0.01, 50));
        assertEquals("Giỏi", RankAcademic.academic(3.99, 50));
        assertEquals("Giỏi", RankAcademic.academic(4.0, 50));
        assertEquals("Input không hợp lệ", RankAcademic.academic(4.01, 50));

        /*
        * Kiểm thử theo bảng quyết định
        */
        assertEquals("Input không hợp lệ", RankAcademic.academic(-1.1, 23));
        assertEquals("Input không hợp lệ", RankAcademic.academic(0.5, -1));
        assertEquals("Kém", RankAcademic.academic(0.5, 25));
        assertEquals("Input không hợp lệ", RankAcademic.academic(0.5, 110));
        assertEquals("Input không hợp lệ", RankAcademic.academic(1.5, -1));
        assertEquals("Kém", RankAcademic.academic(1.5, 25));
        assertEquals("Yếu", RankAcademic.academic(1.5, 50));
        assertEquals("Input không hợp lệ", RankAcademic.academic(1.5, 110));
        assertEquals("Input không hợp lệ", RankAcademic.academic(2.3, -1));
        assertEquals("Yếu", RankAcademic.academic(2.3, 25));
        assertEquals("Trung bình", RankAcademic.academic(2.3, 70));
        assertEquals("Input không hợp lệ", RankAcademic.academic(2.3, 110));
        assertEquals("Input không hợp lệ", RankAcademic.academic(3.0, -1));
        assertEquals("Trung bình", RankAcademic.academic(3.0, 50));
        assertEquals("Khá", RankAcademic.academic(3.0, 65));
        assertEquals("Input không hợp lệ", RankAcademic.academic(3.0, 110));
        assertEquals("Input không hợp lệ", RankAcademic.academic(3.4, -1));
        assertEquals("Khá", RankAcademic.academic(3.4, 50));
        assertEquals("Giỏi", RankAcademic.academic(3.4, 85));
        assertEquals("Input không hợp lệ", RankAcademic.academic(3.4, 110));
        assertEquals("Input không hợp lệ", RankAcademic.academic(3.8, -1));
        assertEquals("Giỏi", RankAcademic.academic(3.8, 80));
        assertEquals("Xuất sắc", RankAcademic.academic(3.8, 90));
        assertEquals("Input không hợp lệ", RankAcademic.academic(3.8, 110));
        assertEquals("Input không hợp lệ", RankAcademic.academic(4.1, 6));
        

    }
}
