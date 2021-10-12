package my;

/**
 * Hello world!
 *
 */
public class RankAcademic {
    public static void main( String[] args )
    {
       double GPA = 3.6;
       int Conduct = 90;
       System.out.println(academic(GPA, Conduct));

    }

    public static String academic(double GPA, int Conduct) {
        if (GPA < 0 || GPA > 4.0 || Conduct < 0 || Conduct > 100) {
            return "Input không hợp lệ";
        }

        if (GPA < 1.0) {
            return "Kém";
        }
        else if (GPA < 2.0) {
            if (Conduct >= 35) return "Yếu";
            else return "Kém";
        }
        else if (GPA < 2.5) {
            if (Conduct >= 50)  return "Trung bình";
            else return "Yếu";
        }
        else if (GPA < 3.2) {
            if (Conduct >= 65) return "Khá";
            else return "Trung bình";
        }
        else if (GPA < 3.6) {
            if (Conduct >= 80) return "Giỏi";
            else return "Khá";
        }
        else if (GPA <= 4.0) {
            if (Conduct >= 90) return "Xuất sắc";
            else return "Giỏi";
        }

        return "";
    }

}
