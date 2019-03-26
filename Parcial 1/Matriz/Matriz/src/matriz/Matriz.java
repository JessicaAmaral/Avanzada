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
public class Matriz {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        Operaciones_Con_Matrices op = new Operaciones_Con_Matrices();
        System.out.println("OPERACIONES CON MATRICES:\n");
        System.out.println("1)SUMA");
        System.out.println("2)RESTA");
        System.out.println("3)MULTIPLICACION");
        System.out.println("4)TRANSPUESTA");
        System.out.println("5)INVERSA");
        System.out.println("6)DETERMINANTE\n");
        opcion = in.nextInt();
        Matrices matriz1 = null;
        Matrices matriz2 = null;
        int tamaño;
        if(opcion == 1 || opcion == 2)
        {
            int iguales;
            System.out.println("Ingrese el tamaño de la matriz 1:");
            tamaño = in.nextInt();
            matriz1 = new Matrices(tamaño, tamaño);
            matriz1.llenarMatriz();
            System.out.println("Ingrese el tamaño de la matriz 2:");
            iguales = in.nextInt();
            while(matriz1.getFilas() != iguales)
            {
                System.out.println("Oye amika tienen que ser del mismo tamaño ingresalo otra vez:");
                iguales = in.nextInt();
            }
            matriz2 = new Matrices(iguales, iguales);
            matriz2.llenarMatriz();
        }
        else if(opcion == 3)
        {
            int f1, c1, f2, c2;
            System.out.println("Filas 1:");
            f1 = in.nextInt();
            System.out.println("Columnas 1:");
            c1 = in.nextInt();
            matriz1 = new Matrices(f1, c1);
            matriz1.llenarMatriz();
             System.out.println("Filas 2:");
            f2 = in.nextInt();
            System.out.println("Columnas 2:");
            c2 = in.nextInt();
            while(matriz1.getColumnas() != f2)
            {
                System.out.println("Oye amika esta mal tu matriz 2:");
                System.out.println("Filas 2:");
                f2 = in.nextInt();
                System.out.println("Columnas 2:");
                c2 = in.nextInt();
            }
            matriz2 = new Matrices(f2, c2);
            matriz2.llenarMatriz();
        }
        else if(opcion == 4)
        {
            int f, c;
            System.out.println("Filas:");
            f = in.nextInt();
            System.out.println("Columnas:");
            c = in.nextInt();
            matriz1 = new Matrices(f, c);
            matriz1.llenarMatriz();
        }
        else if( opcion == 5 || opcion == 6)
        {
            System.out.println("Ingrese el tamaño de la matriz:");
            tamaño = in.nextInt();
            matriz1 = new Matrices(tamaño, tamaño);
            matriz1.llenarMatriz();
        }
        
        switch(opcion)
        {
            case 1:
                op.Suma(matriz1, matriz2);
                break;
            case 2:
                op.Resta(matriz1, matriz2);
                break;
            case 3:
                op.Multiplicacion(matriz1, matriz2);
                break;
            case 4:
                op.Transpuesta(matriz1);
                break;
            case 5:
                op.Inversa(matriz1);
                break;
            case 6:
                op.Determinante(matriz1);
                break;
        }
    }
}
