/**
 * @author Artemia López Gallego
 * @version 1.2
 * @since 13/02/2024
 */
package cuentas.clientes;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0);
        System.out.println("Este es el primer cambio para Git.");
        System.out.println("Este es el segundo cambio para Git");
    }
    
    /**
     * @param cantidad 
     */
    private static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
