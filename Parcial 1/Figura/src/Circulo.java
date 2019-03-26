/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
 class Circulo implements Figura{
    private double radio;
    @Override()
    public double area(){
        return (3.1416*radio*radio);
        
    }
    
    @Override
    public String quienEres(){
    return "Circulo";
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        
    }
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
