package com.youtube;

/**
 * Тут как сэкономить память при склеивание строк, тут используем стрингбилдер с методом append ибо при создание строки происходит
 * создание обьекта и тд
 * нужно запомнить строка не меняется она всегда создает новый обьект типа стринг
 */
public class StringBuilderLesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" my").append(" friend");
        System.out.println(sb);


        /*
        String x = "hello";
//        String y = new String("Text"); можно и так создать строку. Стринг это immutable class не изменяемый
        x = x.toUpperCase();
        System.out.println(x);
         */
    }
}

