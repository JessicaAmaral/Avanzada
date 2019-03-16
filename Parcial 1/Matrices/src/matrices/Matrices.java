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
        int size=0,fila=0, columna=0, fila1=0, columna1=0;
        Operaciones operacion = new Operaciones();
        Scanner in = new Scanner(System.in);
  
        System.out.println("Elija la operación que desea realizar:\n "
                + "1-. Suma\n 2-. Resta\n 3-. Multiplicación\n 4-. Transpuesta\n"
                + " 5-. Inversa\n 6-. Determinante");
        seleccion = in.nextInt();
        
        switch (seleccion){
            case 1:
                System.out.println("Ingrese el tamaño de sus matrices (deben ser"
                        + " de las mismas dimensiones cuadradas)\n"); 
                size = in.nextInt();
                
                System.out.println("Ingrese los valores de la primera matriz");
                Manipular_Datos matriz_sum1 = new Manipular_Datos(size, size);
                matriz_sum1.llenar_matriz();
                
                System.out.println("\nIngrese los valores de la segunda matriz");
                Manipular_Datos matriz_sum2 = new Manipular_Datos(size, size);
                matriz_sum2.llenar_matriz();
                
                operacion.suma(matriz_sum1,matriz_sum2);
                break;
                
            case 2:
                System.out.println("Ingrese el tamaño de sus matrices (deben ser"
                        + " de las mismas dimensiones cuadradas)"); 
                size = in.nextInt();
                
                System.out.println("Ingrese los valores de la primera matriz");
                Manipular_Datos matriz_res1 = new Manipular_Datos(size, size);
                matriz_res1.llenar_matriz();
                
                System.out.println("Ingrese los valores de la segunda matriz");               
                Manipular_Datos matriz_res2 = new Manipular_Datos(size, size);
                matriz_res2.llenar_matriz();
                operacion.resta(matriz_res1,matriz_res2);
                break;  
                
            case 3:
                System.out.println("Ingrese las filas de la primera matriz ("
                        + " debe ser igual a la cantidad de columnas de la matriz 2"); 
                fila = in.nextInt();
                
                System.out.println("Ingrese las columnas de la primera matriz");
                columna = in.nextInt();
                
                System.out.println("Ingrese las filas de la segunda matriz");
                fila1 = in.nextInt();
                
                System.out.println("Ingrese las columnas de la segunda matriz");
                columna1 = in.nextInt();
                if (columna1!=fila) {
                    System.out.println("La cantidad de columnas debe ser igual"
                            + "a la cantidad de filas de la matriz 1");
                    System.out.println("Ingrese las columnas de la segunda matriz");
                    columna1 = in.nextInt();                    
                }
                
                System.out.println("Ingrese los valores de la primera matriz");
                Manipular_Datos matriz_mul1 = new Manipular_Datos(fila, columna);
                matriz_mul1.llenar_matriz();
                
                System.out.println("Ingrese los valores de la segunda matriz");               
                Manipular_Datos matriz_mul2 = new Manipular_Datos(fila1, columna1);
                matriz_mul2.llenar_matriz();
                operacion.multiplicacion(matriz_mul1,matriz_mul2);
                break;                  
                
            case 4:
                System.out.println("Ingrese la cantidad de filas"); 
                fila = in.nextInt();
                System.out.println("Ingrese la cantidad de columnas"); 
                columna = in.nextInt();
                
                System.out.println("Ingrese los valores");
                Manipular_Datos matriz_trans = new Manipular_Datos(fila, columna);
                matriz_trans.llenar_matriz();  
                operacion.transpuesta(matriz_trans);
                break;
                
            case 5:
                System.out.println("Ingrese el tamaño de la matriz"); 
                size = in.nextInt();
                
                System.out.println("Ingrese los valores de la matriz");
                Manipular_Datos matriz_inversa = new Manipular_Datos(size, size);
                matriz_inversa.llenar_matriz();
                operacion.inversa(matriz_inversa);                
                break;
                
            case 6:
                System.out.println("Ingrese el tamaño de la matriz"); 
                size = in.nextInt();
                
                System.out.println("Ingrese los valores de la matriz");
                Manipular_Datos matriz_determinante = new Manipular_Datos(size, size);
                matriz_determinante.llenar_matriz(); 
                operacion.determinante(matriz_determinante);
                break;                
        }
    }
    
}
