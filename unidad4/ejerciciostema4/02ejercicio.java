/*
 */
package tema4ejer.daw.persona;

/**
 *
 * @author usuario-mañana
 */
public class caja {

    private boolean abierto;
    private String mensage;
    private String cera = "la caja esta cerrada ";

    public caja() {
        abierto = false;
        mensage = "viva el tema 7";
    }

    public caja(boolean a, String m) {
        abierto = a;
        mensage = m;
    }

    public caja(String m) {
        mensage = m;
    }

    public boolean getabierto() {
        return abierto;
    }

    public String getmensage() {
        if (abierto) {
            return mensage;
        } else {
            return cera;
        }

    }

    public void setcamviarmensage(String ms) {
        mensage = ms;
    }

    public void setcajaabierta(boolean ab) {
        abierto = ab;
    }
;

}
