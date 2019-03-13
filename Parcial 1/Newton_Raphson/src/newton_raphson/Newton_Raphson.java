/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newton_raphson;

import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class Newton_Raphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int a;
        System.out.println("Ingrese la cantidad de terminos");
        a = in.nextInt();
        double ecuacion[][], x, precision;
        ecuacion=new double[a][2];
        
        for (int i=0;i<a;i++){    
            System.out.println("Ingresa la base del termino "+(i+1));
            ecuacion[i][0]=in.nextDouble();
            System.out.println("Ingresa el exponente del termino "+(i+1));
            ecuacion[i][1]=in.nextDouble();  
            }
        
        System.out.println("Ingrese el valor inicial que quiere que tome x: ");
        x = in.nextDouble();
        System.out.println("Ingrese la precision del resultado que desea: ");
        precision = in.nextDouble();
        Resolver resolver = new Resolver ();
        System.out.println("El resultado mas aproximado es: "+(resolver.procedimiento(ecuacion, x, precision)));
        }
    
        
        
    }
    
    

