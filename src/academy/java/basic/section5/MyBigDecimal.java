package academy.java.basic.section5;
import java.math.BigDecimal;

public class MyBigDecimal {
    public static void main(String[] args) {
        {
            var a = 2;
            var b = 1.1;
            var c = a - b;
            System.out.println(c);
        }
        System.out.println(" ");
        {
            // Использовать для точных исчислений
            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.1");
            BigDecimal c = a.subtract(b);
            System.out.println(c);
        }
    }
}