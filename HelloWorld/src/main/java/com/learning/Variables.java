package com.learning;

public class Variables { // variables y algunos tipos de datos primitivos
    public static void main(String[] args) {

        //variables
        String myString = "Hola, Mundo";
        System.out.println(myString);
        myString = "Adíos, Mundo";
        System.out.println(myString);
        int myInt= 21;

        //constantes
        final String MYSTRING = "Buen día, Mundo"; // se coloca en mayúsculas una constante por buenas prácticas
        System.out.println(MYSTRING);
        //MYSTRING= "Hola"; //daría error porque una constante no se puede cambiar

        //variables con "var"
        var varString = "Hola Mundo, soy una var";
        System.out.println(varString);
        var varDouble = 21.00;
        System.out.println(varDouble);
        var varBoolean = true;
        System.out.println(varBoolean);
        var varChar = 'a'; //comillas simples para char que solo es un character

        //suma de variables declaradas
        int a = 2;
        int b = 3;
        int suma = a+b;
        System.out.println(suma);

        var c = 12;
        System.out.println(c);

    }
}
