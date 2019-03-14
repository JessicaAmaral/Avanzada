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
int num_res;
int den_res;
    public Operaciones() {
    }
    
    public void Resuelve(int n1, int d1, int op, int n2, int d2)
    {

        if(d1!=0 || d2!=0)
        {
            switch(op)
            {
                case 1: //Suma
                    num_res=(n1*d2)+(n2*d1);
                    den_res=(d1*d2);
                    Simplifica();
                    break;
                case 2: //Resta
                    num_res=(n1*d2)-(n2*d1);
                    den_res=(d1*d2);
                    Simplifica();
                    break;
                case 3: //Multiplicacion
                    num_res=(n1*n2);
                    den_res=(d1*d2);
                    Simplifica();
                    break;
                case 4: //Division
                    if(n2!=0)
                    {
                        num_res=(n1*d2);
                        den_res=(n2*d1);
                        Simplifica();
                    }
                    else
                    {
                        System.out.println("Error: el numerador del divisor no puede ser cero");
                    }
                    break;
            }
            Devolver imprimir;        
            imprimir=new Devolver();
            imprimir.Convertir(num_res,den_res);
        }
        else
        {
            System.out.println("Error: Los denominadores no pueden ser cero");
        }
    }
    
    private void Simplifica()
    {
        int n = mcd();
        num_res=num_res/n;
        den_res=den_res/n;
    }
    
    private int mcd()
    {//Algoritmo de Euclides encontrado en internet jeje
        int u = Math.abs(num_res);
        int v = Math.abs(den_res);
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