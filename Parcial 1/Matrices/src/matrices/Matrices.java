/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int seleccion=0;
        int size=0;
        Operaciones operacion = new Operaciones();
        Scanner in = new Scanner(System.in);
  
        System.out.println("Elija la operación que desea realizar:\n "
                + "1-. Suma\n 2-. Resta\n 3-. Multiplicación\n 4-. Transpuesta\n"
                + " 5-. Inversa\n 6-. Determinante");
        seleccion = in.nextInt();
        
        switch (seleccion){
            case 1:
                System.out.println("Ingrese el tamaño de sus matrices (deben ser"
                        + "de las mimas dimensiones cuadradas"); 
                size = in.nextInt();
                Manipular_Datos matriz_sum1 = new Manipular_Datos(size, size);
                matriz_sum1.llenar_matriz();
                Manipular_Datos matriz_sum2 = new Manipular_Datos(size, size);
                matriz_sum2.llenar_matriz();
                operacion.suma(matriz_sum1,matriz_sum2);
                break;
                
            case 2:
                System.out.println("Ingrese el tamaño de sus matrices (deben ser"
                        + "de las mismas dimensiones cuadradas"); 
                size = in.nextInt();
                Manipular_Datos matriz_res1 = new Manipular_Datos(size, size);
                matriz_sum1.llenar_matriz();
                Manipular_Datos matriz_res2 = new Manipular_Datos(size, size);
                matriz_res2.llenar_matriz();
                operacion.resta(matriz_sum1,matriz_res2);
                break;  
                
            case 3:
                break;
                
            case 4:
                break;
                
            case 5:
                break;
                
            case 6:
                break;                
        }
    }
    
}
