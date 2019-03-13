/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newton_raphson;

/**
 *
 * @author Jessica
 */
public class Resolver {
    
    double [][] derivar  (double [][] ecuacion){
        double [][] derivada = new double [ecuacion.length][2];
        for(int i=0; i<ecuacion.length; i++){
            derivada[i][0]=ecuacion[i][0]*ecuacion[i][1];
            derivada[i][1]=ecuacion[i][1]-1;
            if (derivada[i][1]<0){
                derivada[i][1]=0;
            }
                
        }
            return derivada;
                
    }
    
    double procedimiento (double [][] ecuacion, double x, double precision){
        double sustitucion_ecuacion = 0, sustitucion_derivada = 0;
        double[][] derivada;
        derivada = derivar (ecuacion);
        do{
            for(int i=0; i<ecuacion.length; i++){
                sustitucion_ecuacion+=(ecuacion[i][0]*Math.pow(x, ecuacion[i][1]));
                sustitucion_derivada+=(derivada[i][0]*Math.pow(x, derivada[i][1]));
            }
            x = x - (sustitucion_ecuacion/sustitucion_derivada);
        }while (x>precision);

        return x;
    }

   
    
}
    

