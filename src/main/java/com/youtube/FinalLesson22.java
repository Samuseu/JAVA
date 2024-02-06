package com.youtube;

public class FinalLesson22 {
    public static void main(String[] args) {
        final int x = 10;
        System.out.println(x);
        // x=6;  тут мы не можем ибо константу мы изменять не можем
    }

    class Test {
        public static final int CONSTANT = 0;

        /**
         * Тут переменная и конструктор констант
         */
       /*
        public final int CONSTANT;
        public Test(int CONSTANT) {
            this.CONSTANT = CONSTANT;
        }
        */
    }
}
