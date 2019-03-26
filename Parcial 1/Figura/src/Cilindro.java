/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Cilindro implements Figura{
    public double altura;
    public double radio;
    
    @Override()
    public double area(){
        return ((3.1416*2)*radio*altura);
        
    }
    
    @Override
    public String quienEres(){
    return "Cilindro";
    }

    public Cilindro(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    public Cilindro() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
