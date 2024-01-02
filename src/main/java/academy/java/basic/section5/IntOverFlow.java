package academy.java.basic.section5;

public class IntOverFlow {
    public static void main(String[] args) {
        {
            var i = Integer.MAX_VALUE; // Макс значение
            System.out.println(i);
            System.out.println(i + 1);
        }
        System.out.println(" ");
        {
            var i = Integer.MIN_VALUE; // Мин значение
            System.out.println(i);
            System.out.println(i - 1);
        }
    }
}
