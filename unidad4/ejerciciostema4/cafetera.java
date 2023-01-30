/*
 */
package CAFETERIA;

/**
 *
 * @author usuario-mañana
 */
public class cafetera {
    private int max;
    private int actu;
    
    public cafetera(){
    max=1000;
    actu=0;
    };
    
   
    public cafetera(int mx){
   actu=mx;
   max=mx;
   
    };
   public cafetera( int mx, int ac ){
       max=mx;      
       actu=ac;
   if (ac>max){max=ac;}
   };
    
    public int getcantidadcafetera (){
      return actu;
    };
    
    public void setllenarcafetera(){
    actu=max;};
    public void setvaciarcafetera(){
    actu=0;
    };
          public void setagregarcafe(int ag){
          actu=actu+ag;
          };  
    public void setservirtaza(int taz){
    if(taz>actu){actu=0;}else{actu=actu-taz;}
    
    };
}
