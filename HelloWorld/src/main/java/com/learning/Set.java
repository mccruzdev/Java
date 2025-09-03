package com.learning;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        // se guardan de manera desordenada
        HashSet<String> nombres = new HashSet<>();
        var nombresHash = new HashSet<String>();

        nombresHash.add("Pepe");
        nombresHash.add("Juan");
        nombresHash.add("mcruz");

        System.out.println(nombresHash);
        System.out.println(nombresHash.size());

        System.out.println(nombresHash.contains("mc")); //false
        System.out.println(nombresHash.contains("mcruz")); //true

        //podemos agregar muchos iguales y aun así solo carga uno
        System.out.println(nombresHash);
        nombresHash.add("mcruz");
        nombresHash.add("mcruz");
        nombresHash.add("mcruz");
        System.out.println(nombresHash);

        //agregar de un hashset a otro hashset
        var paises = new HashSet<String>();
        paises.add("perú");
        paises.add("Chile");
        paises.add("Argentina");
        paises.add("mcruz");
        nombresHash.addAll(paises);
        System.out.println(nombresHash);
        nombresHash.removeAll(paises);
        System.out.println(nombresHash);
        paises.add("mcruz");
        nombresHash.add("mcruz");
        //retainAll mantiene el elemento el común de nombresHash con Paises
        nombresHash.retainAll(paises);
        System.out.println(nombresHash);






    }
}
