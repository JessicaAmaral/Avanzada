/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Circulo extends Coordenada {
    double radio;
    
    public Circulo (double radio, int x, int y){
        super (x,y);
        this.radio = radio;
        
        
    }
    
    public Circulo (){
        
    }

    public double getRadio() {
        return radio;
       
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
        
 }
    

