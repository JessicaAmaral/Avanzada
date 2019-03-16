/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * En esta clase se resuelven las operaciones y envía a convertir
 * los números a string nuevamente
 * @author Jessica
 */
public class Operaciones {
int numerador; //numerador resultante
int denominador; //denominador resultante 

    public Operaciones() {
    }
    /**
     * 
     * @param numerador1 numerador de la primera fracción.
     * @param denominador1 denominador de la primera fracción.
     * @param operacion operación a realizar (según el número recibido de la 
     * clase anterior.
     * @param numerador2 numerador de la segunda fracción.
     * @param denominador2 denominador de la segunda fracción.
     */
    public void Resuelve(int numerador1, int denominador1, int operacion, 
            int numerador2, int denominador2)
    {

        if(denominador1!=0 || denominador2!=0)
        {
            switch(operacion)
            {
                case 1: //Suma
                    numerador=(numerador1*denominador2)+(numerador2*denominador1);
                    denominador=(denominador1*denominador2);
                    Simplifica();
                    break;
                case 2: //Resta
                    numerador=(numerador1*denominador2)-(numerador2*denominador1);
                    denominador=(denominador1*denominador2);
                    Simplifica();
                    break;
                case 3: //Multiplicacion
                    if (numerador==0){
                        System.out.println("Error");
                        break;
                    }
                    numerador=(numerador1*numerador2);
                    denominador=(denominador1*denominador2);
                    Simplifica();
                    break;
                case 4: //Division
                    if(numerador2!=0)
                    {
                        numerador=(numerador1*denominador2);
                        denominador=(numerador2*denominador1);
                        Simplifica();
                    }
                    else
                    {
                        System.out.println("Error: el numerador del divisor "
                                + "no puede ser cero");
                    }
                    break;
            }
            Devolver imprimir;        
            imprimir=new Devolver();
            imprimir.Convertir(numerador,denominador);
        }
        else
        {
            System.out.println("Error: Los denominadores no pueden ser cero");
        }
    }
    
    private void Simplifica()
    {
        int n = mcd();
        numerador=numerador/n;
        denominador=denominador/n;
    }
    
    private int mcd()
    {/**
     * Algoritmo de Euclides encontrado en internet jeje. Utilizado para la 
     * simplificación de fracciones.
     */ 
        
        int u = Math.abs(numerador);
        int v = Math.abs(denominador);
        if(v==0)
        {
            return u;
        }
        int r;
        while(v!=0)
        {
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }
}