/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author lghhs
 */
public class Operaciones_Con_Matrices {
    
    //Construtcor de la clase
    public Operaciones_Con_Matrices()
    {
        
    }
    
    /**
     * Recibe dos matrices y muestra la matriz resultado de sumarlas
     * @param m1 Matriz 1
     * @param m2 Matriz 2
     */
    public void Suma(Matrices m1, Matrices m2)
    {
        int tamaño = m1.getFilas();
        Matrices resultado = new Matrices(tamaño, tamaño);
        for(int i = 0; i < tamaño; i++)
        {
            for(int j = 0; j < tamaño; j++)
            {
                resultado.setInMatriz(i, j, m1.getFromMatriz(i, j)+m2.getFromMatriz(i, j));
            }
        }  
        resultado.mostrarMatriz();
    }
    
    /**
     * Recibe dos matrices y muestra la matriz resultado de restarlas
     * @param m1 Matriz 1
     * @param m2 Matriz 2
     */
    public void Resta(Matrices m1, Matrices m2)
    {
        int tamaño = m1.getFilas();
        Matrices resultado = new Matrices(tamaño, tamaño);
        for(int i = 0; i < tamaño; i++)
        {
            for(int j = 0; j < tamaño; j++)
            {
                resultado.setInMatriz(i, j, m1.getFromMatriz(i, j)-m2.getFromMatriz(i, j));
            }
        }  
        resultado.mostrarMatriz();
    }
    
    
    /**
     * Recibe dos matrices y muestra la matriz resultado de multiplicarlas
     * @param m1 Matriz 1
     * @param m2 Matriz 2
     */
    public void Multiplicacion (Matrices m1, Matrices m2)
    {
        int filas = m1.getFilas();
        int columnas = m1.getColumnas();
        int columnas_res = m2.getColumnas();
        Matrices resultado = new Matrices(filas, columnas_res);
        int restemp = 0;
        for(int i = 0; i < filas; i++)
        {
            for(int j = 0; j < columnas_res; j++)
            {
                for(int l = 0; l < columnas; l++)
                {
                    restemp += m1.getFromMatriz(i, l)*m2.getFromMatriz(l, j);
                }
                resultado.setInMatriz(i, j, restemp);
                restemp = 0;
            }
        }  
        resultado.mostrarMatriz();
    }
    
    /**
     * Recibe una matriz y muestra la transpuesta
     * @param m Matriz
     */
    public void Transpuesta (Matrices m)
    {
        int f = m.getFilas();
        int c = m.getColumnas();
        Matrices trans = new Matrices(c, f);
        for(int i = 0; i < f; i++)
        {
            for(int j = 0; j < c; j++)
            {
                trans.setInMatriz(j, i, m.getFromMatriz(i, j));
            }
        }  
        trans.mostrarMatriz();
    }
    
    /**
     * Recibe una matriz y muestra la inversa
     * @param m Matriz
     */
    public void Inversa (Matrices m)
    {
        int tamaño = m.getFilas();
        Matrices resultado = new Matrices(tamaño, tamaño);
        double temp, temp2;
        for(int i = 0; i < tamaño; i++)
        {
            for(int j = 0; j < tamaño; j++)
            {
                if(i == j)
                {
                    resultado.setInMatriz(i, j, 1);
                }
                else
                {
                    resultado.setInMatriz(i, j, 0);
                }
            }
        }
        for(int i = 0; i < tamaño; i++)
        {
            temp = m.getFromMatriz(i, i);
            if(temp == 0.0)
            {
                System.out.println("Jsjsjsjs, Esa matriz inversa no existe krnal nmms");
                return;
            }
            for(int j = 0; j < tamaño; j++)
            {
                m.setInMatriz(i, j, m.getFromMatriz(i, j)/temp);
                resultado.setInMatriz(i, j, resultado.getFromMatriz(i, j)/temp);
            }
            for(int j = 0; j < tamaño; j++)
            {
                temp2 = m.getFromMatriz(j, i);
                if(j != i)
                {
                    for(int l = 0; l < tamaño; l++)
                    {
                        m.setInMatriz(j, l, m.getFromMatriz(j, l)-temp2*m.getFromMatriz(i, l));
                        resultado.setInMatriz(j, l, resultado.getFromMatriz(j, l)-temp2*resultado.getFromMatriz(i, l));
                    }
                }
            }
        }
        resultado.mostrarMatriz();
    }
    
    /**
     * Recibe una matriz y muestra la determinante 
     * @param m Matriz
     */
    public void Determinante(Matrices m)
    {
        int tamaño = m.getFilas();
        double temp, temp2, resultado = 1;
        Matrices respaldo = new Matrices(tamaño, tamaño);
        for(int i = 0; i < tamaño; i++)
        {
            temp = m.getFromMatriz(i, i);
            for(int j = 0; j < tamaño; j++)
            {
                respaldo.setInMatriz(i, j, m.getFromMatriz(i, j));
                m.setInMatriz(i, j, m.getFromMatriz(i, j)/temp);
            }
            for(int j = i+1; j < tamaño; j++)
            {
                temp2 = m.getFromMatriz(j, i);
                    for(int l = 0; l < tamaño; l++)
                    {
                        m.setInMatriz(j, l, m.getFromMatriz(j, l)-temp2*m.getFromMatriz(i, l));
                    }
            }
            resultado *= respaldo.getFromMatriz(i, i);
        }
        System.out.println("Resultado: "+resultado);
    }
}
