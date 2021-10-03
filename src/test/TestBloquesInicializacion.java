
package test;

import domain.Persona;


public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona per1 = new Persona();
        System.out.println("per1 = " + per1);
        System.out.println(per1.getIdPersona());
        Persona per2 = new Persona();
        System.out.println("per2 = " + per2);
    }
}
