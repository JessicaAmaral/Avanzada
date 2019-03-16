package matrices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Operaciones {

    public Operaciones() {
    }
    
    public void suma(Manipular_Datos m1, Manipular_Datos m2){
        int filas = m1.getFila();
        int columnas = m1.getColumna();
        Manipular_Datos resultado;
        resultado = new Manipular_Datos(filas, columnas);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setMatriz(i, j, m1.getMatriz(i, j) + m2.getMatriz(i, j));
            }          
        }
        resultado.mostrar_matriz();
    }
    
    public void resta (Manipular_Datos m1, Manipular_Datos m2){
        int filas = m1.getFila();
        int columnas = m1.getColumna();
        Manipular_Datos resultado;
        resultado = new Manipular_Datos(filas, columnas);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setMatriz(i, j, m1.getMatriz(i, j) - m2.getMatriz(i, j));
            }          
        }
        resultado.mostrar_matriz();
    }
    
    public void multiplicacion (Manipular_Datos m1, Manipular_Datos m2){
        int filas = m1.getFila();
        int columnas = m1.getColumna();
        int columnas_res = m2.getColumna();
        Manipular_Datos resultado = new Manipular_Datos(filas, columnas_res);
        int restemp = 0;
        for(int i = 0; i < filas; i++)
        {
            for(int j = 0; j < columnas_res; j++)
            {
                for(int l = 0; l < columnas; l++)
                {
                    restemp += m1.getMatriz(i, l)*m2.getMatriz(l, j);
                }
                resultado.setMatriz(i, j, restemp);
                restemp = 0;
            }
        }  
        resultado.mostrar_matriz();
    }
    
    public void inversa (Manipular_Datos m){
        
        int size = m.getFila();
        Manipular_Datos resultado = new Manipular_Datos(size, size);
        double temp, temp2;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == j){
                    resultado.setMatriz(i, j, 1);
                }
                else{
                    resultado.setMatriz(i, j, 0);
                }
            }
        }
        for(int i = 0; i < size; i++){
            temp = m.getMatriz(i, i);
            if(temp == 0.0){
                System.out.println("La inversa no existe");
                return;
            }
            for(int j = 0; j < size; j++){
                m.setMatriz(i, j, m.getMatriz(i, j)/temp);
                resultado.setMatriz(i, j, resultado.getMatriz(i, j)/temp);
            }
            for(int j = 0; j < size; j++){
                temp2 = m.getMatriz(j, i);
                if(j != i){
                    for(int l = 0; l < size; l++){
                        m.setMatriz(j, l, m.getMatriz(j, l)-temp2*m.getMatriz(i, l));
                        resultado.setMatriz(j, l, resultado.getMatriz(j, l)
                        -temp2*resultado.getMatriz(i, l));
                    }
                }
            }
        }
        resultado.mostrar_matriz();           
    }
    
    public void transpuesta (Manipular_Datos m){
        int fila = m.getFila();
        int columna = m.getColumna();
        Manipular_Datos transpuesta;
        transpuesta = new Manipular_Datos(columna, fila);
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {               
                transpuesta.setMatriz(j, i, m.getMatriz(i, j));               
            }            
        }       
        transpuesta.mostrar_matriz();
    }
    
    public void determinante (Manipular_Datos m){
        int size = m.getFila();
        double temp, temp2, resultado = 1;
        Manipular_Datos respaldo = new Manipular_Datos(size, size);
        for(int i = 0; i < size; i++)
        {
            temp = m.getMatriz(i, i);
            for(int j = 0; j < size; j++)
            {
                respaldo.setMatriz(i, j, m.getMatriz(i, j));
                m.setMatriz(i, j, m.getMatriz(i, j)/temp);
            }
            for(int j = i+1; j < size; j++)
            {
                temp2 = m.getMatriz(j, i);
                    for(int l = 0; l < size; l++)
                    {
                        m.setMatriz(j, l, m.getMatriz(j, l)-temp2*m.getMatriz(i, l));
                    }
            }
            resultado *= respaldo.getMatriz(i, i);
        }
        System.out.println("Resultado: "+resultado);        
    }
    
}
