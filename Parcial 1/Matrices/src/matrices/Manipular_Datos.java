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
class Manipular_Datos {
    Scanner in = new Scanner(System.in);
    double[][] matriz;
    int fila, columna;
    
    public Manipular_Datos(int fil, int col) {
        
        int fila = fil;
        int columna = col;
        
        if (fila>20 || columna < 2) {
            
            System.out.println("La matriz no puede pasar los valores de"
                    + "[20][2]");
            fila = in.nextInt();
            columna = in.nextInt();
                   
        }       
         matriz = new double[fila][columna];
    }
    
    public void llenar_matriz (){
        
        for (int i = 0; i <= fila; i++) {
            for (int j = 0; j <= columna; j++) {
                
                System.out.println("Ingrese el número en la posición"+
                        "["+i+"]"+"["+j+"]");
                matriz[i][j]=in.nextFloat();
                
            }           
        }
    mostrar_matriz();
    }
    
    public void mostrar_matriz(){
        
        for (int i = 0; i <= fila; i++) {
            System.out.print("|");
            for (int j = 0; j <= columna; j++) {
                
                System.out.print(matriz[i][j]);  
            }                      
        }    
    }

    public double[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][] matriz) {
        this.matriz = matriz;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
            
    
    
}
