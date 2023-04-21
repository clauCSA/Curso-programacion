/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioejercicioextra2;

/**
 *
 * @author larry
 */
public class ServicioEjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
  a  Todos
public class Nif {

    static char letrasDni(int resto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private long dni;
    private char letra;

    public static final char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
        'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Nif() {
    }

    public Nif(long dni, char letra) {
        this.dni = dni;
        this.letra = calcularletra(dni);
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    private char calcularletra(long dni) {
        int resto = (int) (dni % 23);
        return letrasDni[resto];
    }

    public String mostrar() {
        String dniStr = String.format("%08d", dni);
        return dniStr + "-" + Character.toUpperCase(letra);
    }

    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", letra=" + letra + '}';
    }
    
}
public class Servicio {

    int resto = 0;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Nif nif0 = new Nif();

    public void crearNIf() {

        System.out.println("ingrese dni");
        long dni = sc.nextLong();
        nif0.setDni(dni);
        nif0.setLetra(letrasDni[resto]);

    }

    public char calcularLetra(long dni) {
        char x = 0;

        resto = (int) (dni % 23);

       x =  letrasDni[resto]; 

        System.out.println(resto);
        nif0.setLetra(x);
        System.out.println("nif " + nif0.getDni() + "-" + nif0.getLetra());
        return x;

    }

    public void mostrar(Nif nif0) {

        System.out.println(nif0.mostrar());
    }
}