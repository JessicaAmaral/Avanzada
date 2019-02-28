/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Procedimiento{
    
    //variables booleanas para comprobar la realidad del resultado de la raíz.
    public boolean imag;
    
    //declaramos las 3 variables como cada parámetro introducido por el usuario.
    public double a, b, c;
    
    //declaramos público el string que contendrá los resultados de la ecuación.
    public String r = null;
    
    //creaos el constructor que recibe los datos del main
    public String Procedimiento(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

        
        //declaramos nuestras variables para cada resultado (xe almacena la parte de la raíz cuadrada de la ecuación)
        // para imprimir los resultados con numero complejos.
        double x1 = 0, x2 = 0, xe = 0;
        
        //comprobamos si el resultado de las operaciones dentro de la raiz es negativo. Si lo es dividimos el resultado
        //en 2 partes, la real y la compleja(x1 = real y xe = compleja). Después metemos los resultados a la string
        //que retornará el resultado
        if((Math.pow(b, 2)) - (4*a*c) < 0) {
            
            x1 = -b ;
            xe = (Math.sqrt(-(Math.pow(b, 2)) + (4*a*c)));
            x1 = x1/(2*a);
            xe = xe/(2*a);
            r = ("X1 = " +x1+ " + " +xe+ " i   " )+("X2 = "+x1+" - "+xe+" i");
        }
        //Si no es negativo entonces desarrollamos la operación de manera normal y metemos los resultados a la string
         //que retornará el resultado
        else{
            x1 = -b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c)));
            x1 = x1/(2*a);
            x2 = -b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c)));
            x2 = x2/(2*a);
            r = ("X1 =" +x1)+("    X2 ="+x2);
        }
        //Retornamos la string con los resultados.
        return r;
 
    }
}