



package tema4ejer;
import tema4ejer.daw.persona.DNI;
import tema4ejer.daw.persona.caja;
/**
 *
 * @author usuario-mañana
 */
public class Tema4ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      caja d = new caja();
      caja c=new caja(true,"ewudfhfgdp");
      
      System.out.println(d.getmensage());
      d.setcajaabierta(true);
        System.out.println(d.getmensage());
        System.out.println(c.getabierto());
        c.setcamviarmensage("diudfpa");
        System.out.println(c.getmensage());
     
     
      
        
    }

}
