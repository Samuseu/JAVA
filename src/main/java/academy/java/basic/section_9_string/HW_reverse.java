package academy.java.basic.section_9_string;

public class HW_reverse {
    public static void main(String[] args) {
        String s1 = "!dlrow olleH";

        System.out.println(s1.length());
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
    }


}
