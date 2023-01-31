package tema4ejer;

import tema4ejer.daw.persona.DNI;
import tema4ejer.daw.persona.MarcadorBaloncesto;
import java.time.LocalDate;

/**
 *
 * @author usuario-mañana
 */
public class Tema4ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha = null;
        fecha = fecha.now();

        MarcadorBaloncesto b1 = new MarcadorBaloncesto("l", "v");
        MarcadorBaloncesto b2 = new MarcadorBaloncesto("l", 51, "v", 35, fecha);
        MarcadorBaloncesto b3 = new MarcadorBaloncesto("l", "v", fecha);
        System.out.println(b1.getnombrelocal() + b1.getpuntoslocal());
        System.out.println(b2.getnombrevisitante() + b2.getpuntosvisitante());
        b2.setcanastados("v");
        System.out.println(b2.getnombrevisitante() + b2.getpuntosvisitante());

    }

}
