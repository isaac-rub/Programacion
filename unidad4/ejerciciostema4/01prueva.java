



package tema4ejer;
import tema4ejer.daw.persona.DNI;
/**
 *
 * @author usuario-mañana
 */
public class Tema4ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      DNI d =new DNI("12345678a");
        
      DNI a =new DNI(12345678,'g');
      
       System.out.println(d.getletra()+""+d.getnumero());
        System.out.println(a.getletra()+""+a.getnumero());
     
     
      
        
    }

}
