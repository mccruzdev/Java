package com.learning;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // nombres asociados al email
        HashMap<String,String> names = new HashMap<>();
        // numero asociado al correo de Alex
        var numbers =  new HashMap<Integer,String>();

        names.put("Alex", "mccruzzz11@gmail.com");
        numbers.put(936363981, names.get("Alex"));
        System.out.println(numbers);

        //acceder a los datos
        System.out.println(names.get("Alex"));
        System.out.println(numbers.get(936363981));

        //verificar si están los datos
        System.out.println(names.containsKey("Alex"));
        System.out.println(names.containsValue("mccruzzz11@gmail.com"));

        //eliminar
        names.remove("Alex");
        System.out.println(names);

        //limpiar todo el HashMap
        names.clear();
        System.out.println(names);

        //actualizar
        names.put("Alex", "mccruzzz11@gmail.com");
        System.out.println(names);
        names.put("Alex", "Alex@gmail.com");
        System.out.println(names);
        names.replace("Alex", "jeje"); //reemplaza solo si existe la clave "Alex"
        System.out.println(names);
        names.putIfAbsent("Juan", "jota@gmail.com"); //crea solo si no existe
        System.out.println(names);




    }
}
