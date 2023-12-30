package academy.java.basic.section_9_string;

public class StringIntro {
    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);
        }
        System.out.println("\n------------");

        String s2 = "hello";
        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i));
        }
    }
}
