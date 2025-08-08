package lab.lab3;
import lab.labEx3.Q4;

public class QTest4 extends Q4 {
    public static void main(String[] args) {
        QTest4 qt = new QTest4();
        // System.out.println(qt.aa);   //not accessible its private
        System.out.println(qt.bb);
        //System.out.println(qt.cc);
        System.out.println(qt.dd);
    }
}
