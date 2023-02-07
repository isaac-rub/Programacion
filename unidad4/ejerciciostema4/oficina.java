/*
 */
package tema4ejer.daw.persona;

import java.util.ArrayList;

/**
 *
 * @author usuario-mañana
 */
public class oficina {

    private String nombre;
    private ArrayList<String> trabajadores = new ArrayList<String>();

    public oficina(String n) {
        nombre = n;
        trabajadores = null;

    }

    public oficina() {
        nombre = "Industrias DAW";
        trabajadores.add("Antonio Pérez Pérez 11111111H 900 28/2/2000");
        trabajadores.add("Luis López López 22222222J 1000 10/9/1995");
        trabajadores.add("Ana Díaz Díaz 33333333P 1200 21/5/1985");
    }

    public oficina(String nombre, int tipo) {
        if (tipo == 0 || tipo > 3) {
            trabajadores = null;
        } else {
            if (tipo == 1) {
                trabajadores.add("Antonio Pérez Pérez 11111111H 900 28/2/2000");
            } else {
                if (tipo == 2) {
                    trabajadores.add("Antonio Pérez Pérez 11111111H 900 28/2/2000");
                    trabajadores.add("Luis López López 22222222J 1000 10/9/1995");
                } else {
                    if (tipo == 3) {
                        trabajadores.add("Antonio Pérez Pérez 11111111H 900 28/2/2000");
                        trabajadores.add("Luis López López 22222222J 1000 10/9/1995");
                        trabajadores.add("Ana Díaz Díaz 33333333P 1200 21/5/1985");

                    }
                }

            }
        }

    }
    public ArrayList gettrabajadores(){
    return trabajadores;
    }
     public String getnombre(){
    return nombre;
    }
      public void setcamviarnombre(String n) {
      nombre=n;
      }
    
    
    
    
}
