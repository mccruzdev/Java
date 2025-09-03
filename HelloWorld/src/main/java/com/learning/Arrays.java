package com.learning;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros =  new int[3];
        System.out.println(numeros.length);

        String[] nombres = {"alex", "juan", "pepe"};
        System.out.println(nombres[0]);

        System.out.println(numeros[2]);

        //modificación
        numeros[0] = 15;
        numeros[2] = 20;
        System.out.println(numeros[0]);
        System.out.println(numeros[2]);

        System.out.println(nombres[2]);
        nombres[2] =  "Juanete";
        System.out.println(nombres[2]);
    }
}