/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author lghhs
 */
public class Matrices {
    //Este arreglo guarada los valores de la matriz
    double[][] Matriz;
    //Se utiliza para el ingreso de datos
    Scanner in = new Scanner(System.in);
    //Numero de filas y numero de columnas de la matriz
    int filas, columnas;
    
    /**Constructor de la clase que recibe el número de filas y columnas.
     * No permite que los valores sean menores a dos o mayores a 20
     * @param f filas
     * @param c columnas
     */
    public Matrices(int f, int c)
    {
        filas = f;
        columnas = c;
        if(filas > 20 || columnas < 2 || filas > 20 || columnas < 2)
        {
            System.out.println("Ingresa un tamaño de máximo 20 y mínimo 2 porfa, grax amik@");
            filas = in.nextInt();
            columnas = in.nextInt();
        }
        Matriz = new double[filas][columnas];
    }
    
    /**
     * Método que permite poner en la matriz los elementos que tendrá
     */
    public void llenarMatriz()
    {
        for(int i = 0; i < filas; i++)
        {
            for(int j = 0; j < columnas; j++)
            {
                System.out.println("Ingrese el "+(j+1)+"° elemento de la "+(i+1)+"° fila");
                Matriz[i][j] = in.nextFloat();
            }
        }
    }
    
    /**
     * Método que imprime la matriz en la consola
     */
    public void mostrarMatriz()
    {
        for(int i = 0; i < filas; i++)
        {
            System.out.print("|");
            
            for(int j = 0; j < columnas; j++)
            {
                System.out.print(Matriz[i][j]);
                if(j != filas-1)
                {
                   System.out.print("  ");
                }
            }

            System.out.print("|\n");
        } 
    }  
    
    /**
     * Método para obtener un valor especifico de la matriz
     * @param i Fila del elemento
     * @param j Columna del elemento
     * @return Elemento buscado
     */
    public double getFromMatriz(int i, int j)
    {
        return Matriz[i][j];
    }
    /**
     * Coloca un valor en un lugar específico de la matriz
     * @param i Fila de la matriz
     * @param j Columna de la matriz
     * @param d Valor a ingresar
     */
    public void setInMatriz(int i, int j, double d)
    {
        Matriz[i][j] = d;
    }
    
    /**
     * @return Cantidad de filas de la matriz
     */
    public int getFilas()
    {
        return filas;
    }
    /**
     * @return Cantidad de columnas de la matriz 
     */
    public int getColumnas()
    {
        return columnas;
    }
}
