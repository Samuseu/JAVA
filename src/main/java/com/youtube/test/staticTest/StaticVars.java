package com.youtube.test.staticTest;

public class StaticVars {
    static int b;
    int a;

    public static void main(String[] args) {
        StaticVars staticVars = new StaticVars();
        System.out.println(staticVars.a);
        System.out.println(b);
    }
}
