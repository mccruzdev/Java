package com.learning;

public class Conditionals {
    public static void main(String[] args) {

        var edad = 18;

        if (edad > 18) {
            System.out.println("soy mayor de edad");
        } else if (edad == 18) {
            System.out.println( "ya tengo 18");
        } else {
            System.out.println("soy menor de edad");
        }

        //switch

        var dia = 5;
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("ningún día de estos");
        }
    }
}
