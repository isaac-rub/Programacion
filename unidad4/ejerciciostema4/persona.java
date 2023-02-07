/*
 */
package tema4ejer.daw.persona;

import java.time.LocalDate;
import tema4ejer.daw.persona.DNI;

/**
 *
 * @author usuario-mañana
 */
public class persona {

    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private int numero;
    private char letra;

    public persona(String n, DNI d, double s, LocalDate fn) {
        nombre = n;
        dni = d;
        sueldo = s;
        fechaNacimiento = fn;

    }

    public persona(String n, int numDNI, char letraDNI, double s, LocalDate fn) {
        nombre = n;
        sueldo = s;
        fechaNacimiento = fn;
        numero = numDNI;
        letra = letraDNI;

    }

    public persona(String n, DNI d) {
        nombre = n;
        dni = d;
        sueldo = 900;
        fechaNacimiento = fechaNacimiento.now();

    }

    public persona(String n, int numDNI, char letraDNI) {
        nombre = n;
        sueldo = 900;
        fechaNacimiento = fechaNacimiento.now();
        numero = numDNI;
        letra = letraDNI;

    }
    
    
    
    

}
