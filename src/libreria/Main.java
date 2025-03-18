
package libreria;

/**
 * Programa principal donde añadimos ingresos y compramos un libro usando la clase LibreriaRuizRodriguezMiguelJose2425T4
 * @author Miguel Jose Ruiz Rodriguez
 */
public class Main {
  
    public static void main(String[] args) {
        LibreriaRuizRodriguezMiguelJose2425T4 miLibreriaRuizRodriguezMiguelJose2425T4;
        
        miLibreriaRuizRodriguezMiguelJose2425T4 = new LibreriaRuizRodriguezMiguelJose2425T4("Don Quijote de la Mancha", 10, 45, 120);

        comprarQuijoteRuizRodriguezMiguelJose2425T4(miLibreriaRuizRodriguezMiguelJose2425T4); 
        
        añadeIngresoRuizRodriguezMiguelJose2425T4(miLibreriaRuizRodriguezMiguelJose2425T4, "Libro vendido");
    }

    /**
     * Metodo para Añadir ingresos en el saldo de la libreria
     * @param miLibreriaRuizRodriguezMiguelJose2425T4
     * @param concepto 
     */
    private static void añadeIngresoRuizRodriguezMiguelJose2425T4(LibreriaRuizRodriguezMiguelJose2425T4 miLibreriaRuizRodriguezMiguelJose2425T4, java.lang.String concepto) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            miLibreriaRuizRodriguezMiguelJose2425T4.aumentarSaldo(ingreso);
            saldoActual = miLibreriaRuizRodriguezMiguelJose2425T4.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
    
    /**
     * Metodo donde realizamos la compra de el Quijote
     * @param miLibreriaRuizRodriguezMiguelJose2425T4 
     */
    private static void comprarQuijoteRuizRodriguezMiguelJose2425T4(LibreriaRuizRodriguezMiguelJose2425T4 miLibreriaRuizRodriguezMiguelJose2425T4) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        int stock;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaRuizRodriguezMiguelJose2425T4.obtenerPrecio();
            saldoActual = miLibreriaRuizRodriguezMiguelJose2425T4.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaRuizRodriguezMiguelJose2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
        saldoActual = miLibreriaRuizRodriguezMiguelJose2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaRuizRodriguezMiguelJose2425T4.obtenerNombre();
        stock = miLibreriaRuizRodriguezMiguelJose2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
    }
}
