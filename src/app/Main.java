package app;
import classes.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<Persona>();
        personas = Arrays.asList(new Persona("Mauri", 20, 41678329),
                                new Persona("Pepe", 55, 10234111),
                                new Persona("Lucas",15,47356911),
                                new Persona("Marcos",22,19888367),
                                new Persona("Alejandro",39,31555870));
        System.out.println(String.format("Personas: %s", personas));
        System.out.println(String.format("Mayores a 21: %s",personas.stream().filter(persona -> persona.getEdad()>21).collect(Collectors.toList())));
        System.out.println(String.format("Menores de 18: %s",personas.stream().filter(persona -> persona.getEdad()<18).collect(Collectors.toList())));
        System.out.println(String.format("Mayores a 21 y DNI mayor a 20.000.000: %s",personas.stream().
                filter(persona -> persona.getEdad()>21)
                .filter(persona -> persona.getDni()>20000000)
                .collect(Collectors.toList())));
    }
}
