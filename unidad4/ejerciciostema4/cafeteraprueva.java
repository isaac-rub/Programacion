
import java.awt.Point;
import CAFETERIA.cafetera;

/**
 *
 * @author usuario-mañana
 */
public class prueva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        cafetera c1=new cafetera();
        cafetera c2=new cafetera(2000);
        cafetera c3=new cafetera(2000,500);
        
        
        System.out.println(c1.getcantidadcafetera());
      c1.setllenarcafetera();
      System.out.println(c1.getcantidadcafetera());
      
      
      c2.setservirtaza(1500);
      System.out.println(c2.getcantidadcafetera());
      
      
      c3.setllenarcafetera();
      System.out.println(c3.getcantidadcafetera());
      c3.setvaciarcafetera();
      System.out.println(c3.getcantidadcafetera());
      
      
        
        
       
        
    }

}
