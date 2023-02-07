/*
 */
package tema4ejer.daw.persona;

import java.time.LocalDate;

/**
 *
 * @author usuario-mañana
 */
public class MarcadorBaloncesto {

    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;

    public MarcadorBaloncesto(String nL, String nV) {
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = fecha.now();
    }

    public MarcadorBaloncesto(String nL, String nV, LocalDate f) {
        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = f;
        puntosLocal = 0;
        puntosVisitante = 0;
    }

    public MarcadorBaloncesto(String nL, int pL, String nV, int pV, LocalDate f) {
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = pL;
        puntosVisitante = pV;
        fecha = f;
    }

    public String getnombrelocal() {
        return nombreLocal;
    }

    public String getnombrevisitante() {
        return nombreVisitante;
    }

    public int getpuntoslocal() {
        return puntosLocal;
    }

    public int getpuntosvisitante() {
        return puntosVisitante;
    }

    public LocalDate getfecha() {
        return fecha;
    }
     public void setlibre(String n) {
        if (n == nombreLocal) {
            puntosLocal = puntosLocal + 1;
        } else {
            puntosVisitante = puntosVisitante + 1;
        }
    }

    public void setcanastados(String n) {
        if (n == nombreLocal) {
            puntosLocal = puntosLocal + 2;
        } else {
            puntosVisitante = puntosVisitante + 2;
        }
    }

    public void settriple(String n) {
        if (n == nombreLocal) {
            puntosLocal = puntosLocal + 3;
        } else {
            puntosVisitante = puntosVisitante + 3;
        }
    }
     public void reset(){
     puntosVisitante=0;
     puntosLocal=0;
     }

}
