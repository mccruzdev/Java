package com.learning;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        //declaración y definición

        //definimos un array list con el tipo String y le damos el nombre de "nombres" y creamos el nuevo arraylist.
        ArrayList<String> nombres = new ArrayList<>();
        //declaración normal
        ArrayList<Integer> numeros =  new ArrayList<>();
        //declarado por var
        var numerosVar = new ArrayList<Integer>();
        var nombresVar = new ArrayList<String>();

        //agregar y eliminar de una lista
        System.out.println(numerosVar.size());
        numerosVar.add(9);
        System.out.println(numerosVar.size());
        numerosVar.remove(0);
        System.out.println(numerosVar.size());

        nombresVar.add("Alex");
        nombresVar.add("pepe");
        nombresVar.add("josé");
        System.out.println(nombresVar.getFirst());
        System.out.println(nombresVar.get(1));
        System.out.println(nombresVar.getLast());

        //modificar con set y mostrar con get
        nombresVar.set(0, "mcruz");
        System.out.println(nombresVar.getFirst());

        System.out.println(nombresVar.contains("mc")); //false
        System.out.println(nombresVar.contains("mcruz")); //true

        //limpiar todo el arraylist

        //nombresVar.clear();






    }
}
