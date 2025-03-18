
package libreria;

/**
 * Clase Libreria
 * @author Miguel Jose Ruiz Rodriguez
 */
public class LibreriaRuizRodriguezMiguelJose2425T4 {

    /**
     * Getter de nom
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de nom
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de cantidad
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Setter de cantidad
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Getter de precio
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * setter de precio
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * getter de saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * setter de saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;
    /**
     * Constructor sin argumentos de la clase
    */
    public LibreriaRuizRodriguezMiguelJose2425T4(){}
    
    /**
     * constructor con parámetros para inicializar todas las propiedades de la clase
     * @param nom
     * @param cantidad
     * @param precio
     * @param saldo
     */
    public LibreriaRuizRodriguezMiguelJose2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    
    /**
     * Método que devuelve el nombre del libro
     * @return getNom
     */
    public String obtenerNombre(){
        return getNom();
    }
    /**
     * Método que devuelve el precio del libro
     * @return getPrecio
     */
    public double obtenerPrecio(){
        return getPrecio();
    }
    
    /**
     * Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
     * @return getCantidad
     */
    public int obtenerStock(){
        return getCantidad();
    }
    
    /**
     * Método para obtener el saldo en la cuenta
     * @return getSaldo
     */
    public double obtenerSaldo(){
        return getSaldo();
    }
    /**
     * Método para aumentar el saldo
     * @param saldomas
     * @throws Exception
     */
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<=0)
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        setSaldo(getSaldo() + saldomas);
    }
    /**
     * Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
     * @param canti
     * @throws Exception
     */
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        if (getCantidad()>=canti){
            if (getSaldo() <= getPrecio())
                  throw new Exception ("No hay suficiente saldo para comprar");
            else{
                setCantidad(getCantidad() - canti);
                setSaldo(getSaldo() + (getPrecio() * canti));
            }
        }
        else 
            throw new Exception ("No se pueden comprar más libros de los que hay disponibles");
       
    }
}
