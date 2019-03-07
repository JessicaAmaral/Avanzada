/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Circulo2 {
    
    Coordenada centro;
    double radio;
    
    public Circulo2 (Coordenada centro, double radio){
        this.centro=centro;
        this.radio=radio;
        
    }
    
    public Circulo2 (int x, int y, double radio){
        centro= new Coordenada (x,y);
        this.radio=radio;
        
    }
    
    public Circulo2(){
        centro = new Coordenada();

    }
    
}
