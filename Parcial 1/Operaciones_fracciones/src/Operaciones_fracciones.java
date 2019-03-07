
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Operaciones_fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);      
        String Cadena;
        
        System.out.println("Ingrese la operación que desea resolver");
        Cadena = in.next();
        DividirCadena dividir = new DividirCadena();
        System.out.println(dividir.DividirCadena(Cadena));
        
    }
    
}
