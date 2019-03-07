/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Cilindro extends Circulo{
    
    public double altura, area, volumen;
    
    public Cilindro(double radio, int x, int y) {
        
        super (radio, x, y);
        this.altura=altura;
        
        
    }

    public Cilindro() {
        
    }
    
    public void volumen (){
        
        volumen=(3.1416*(radio*radio))*altura;
        
        
    }
    
    public void area(){
        
    }
    
   
    
}
