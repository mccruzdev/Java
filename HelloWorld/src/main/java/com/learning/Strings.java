package com.learning;

public class Strings {
    public static void main(String[] args) {

        //cadenas de texto
        String  name = "Alexander";
        var surname = new String("Chang");

        //concatenación
        System.out.println(name + " " + surname );

        System.out.println(name.length()); //tamaño de caracteres de la variable

        var completeName = name + surname;
        System.out.println(completeName.length());

        System.out.println(name.charAt(2));// al "e" xander

        System.out.println(name.charAt(name.length()-1));// nos da el tamaño de la palabra y nos da el ultimo character

        System.out.println(name.substring(2,4));

        final String ex =  name.substring(2,4);
        System.out.println(ex);

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        var name2 = "   Hola";
        System.out.println(name2.trim());
        var name3 = "Hola No Se";
        System.out.println(name3.replace(" ", ""));

        //format
        var edad = 21;
        System.out.println(String.format("Hola, %s. Tengo %d", name,edad)); // % y después la inicial del tipo de dato para formatear




    }
}
