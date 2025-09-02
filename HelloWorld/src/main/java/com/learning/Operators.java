package com.learning;

public class Operators {
    public static void main(String[] args) {

        //aritméticos
        int a = 9;
        int b = 2;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //asignación
        a=b;
        System.out.println(a);
        a=a+1;
        System.out.println(a);
        a+=11; // a = a + 11
        System.out.println(a);

        //comparación
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(a == 14);

        //lógicos

        // Y (AND)
        System.out.println(true && true); // V y V = V

        // unarios
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(++a);//suma 1 antes y imprime
        System.out.println(a++);//imprime y suma 1 después
        System.out.println(a);//imprime el a++




    }
}
