package academy.java.basic.section5;

public class UpdateIncrementDecrement {
    public static void main(String[] args) {
        var a = 0;
        System.out.println(a);

        a = 5;
        System.out.println(a);

        a = a + 1;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a ++ ; // a +=1; инкремент
        System.out.println(a);

        a -- ; // a +=1; динкремент
        System.out.println(a);
    }
}
