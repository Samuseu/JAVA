package com.youtube.test.staticTest;

public class Test {
    public static void main(String[] args) {
        StaticVars staticVars1 = new StaticVars();
        StaticVars staticVars2 = new StaticVars();

        System.out.println(StaticVars.b);
        System.out.println(staticVars1.b);

        staticVars1.b = 2;
        staticVars2.b = 6;

        System.out.println(staticVars1.b);
        System.out.println(staticVars2.b);


    }
}


