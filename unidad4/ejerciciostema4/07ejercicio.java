/*
 */
package tema4ejer.daw.persona;

/**
 *
 * @author usuario-mañana
 */
public class Cuentacorriente {

    private int numero;
    private double saldo;

    public Cuentacorriente() {
        saldo=0;
        numero=(int) (Math.random()*1001);
    }

    public Cuentacorriente(int n) {
        saldo=0;
        numero=n;
    }

    public Cuentacorriente(int n, double s) {
        numero=n;
        saldo=s;
    }

    public void añadirDinero(int cantidad) {
       saldo= saldo+cantidad;
    }

    public void retirarDinero(int cantidad) {
        saldo=saldo-cantidad;
    }
    public double getsaldo(){
    return saldo;
    }
    public int getnumero(){
    return numero;
    }

}
