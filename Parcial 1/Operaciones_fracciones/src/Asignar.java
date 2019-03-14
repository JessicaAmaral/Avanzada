

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Asignar {
        
    String[] separar_cad;
    String[] cardinal;
    String[] fraccionario;
    int[] numero_fraccionario;
    int[] numero_cardinal;
    int x, op;

    public Asignar(){
        
        cardinal = new String[]{"cero","un","dos","tres","cuatro","cinco","seis",
        "siete","ocho","nueve","diez","once","doce","trece","catorce","quince",
        "dieciseis","diecisiete","dieciocho","diecinueve","veinte","veintiun",
        "veintidos","veintitres","veinticuatro","veinticinco","veintiseis",
        "veintisiete","veintiocho","veintinueve","treinta","cuarenta","cincuenta"
        ,"sesenta","setenta","ochenta","noventa","cien, quinientos"};
        
        numero_cardinal = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17
        ,18,19,20,21,22,23,24,25,26,27,28,29,30,40,50,60,70,80,90,100,500};
        
        fraccionario = new String[]{"enteros","medios","tercios","cuartos",
        "quintos","sextos","septimos","octavos","novenos","decimos","centesimos"};
        
        numero_fraccionario = new int[]{1,2,3,4,5,6,7,8,9,10,100};
    }

    public void reemplazar (String cadena){
        int numerador1=0, numerador2=0, denominador1=0, denominador2=0, i=0;
        separar_cad= cadena.split(" ");
        numerador1=convertir_numerador (i);
        denominador1=convertir_denominador (i);
        
        for (i=0; i < separar_cad.length; i++) {
            if (separar_cad[i].equals("+")) {
                numerador2=convertir_numerador (i++);
                denominador2=convertir_denominador (i++);
                op =1;
            }
            else if (separar_cad[i].equals("-")) {
                numerador2=convertir_numerador (i++);
                denominador2=convertir_denominador (i++);
                op = 2;
            }
            else if (separar_cad[i].equals("*")) {
                numerador2=convertir_numerador (i++);
                denominador2=convertir_denominador (i++);
                op = 3;
            }
            else if (separar_cad[i].equals("/")) {
                numerador2=convertir_numerador (i++);
                denominador2=convertir_denominador (i++);
                op = 4;
            }
        }
        
        if (numerador1==0 || numerador2 == 0) {
            System.out.println("Error al ingresar el numerador");    
        }
        if (denominador1==0 || denominador2 == 0) {
            System.out.println("Error al ingresar el denominador");    
        }
        
        Operaciones resolver;
        resolver = new Operaciones();
        resolver.Resuelve(numerador1,denominador1,op,numerador2,denominador2);
    }
    
    private int convertir_numerador (int i){
        int numerador=0;
//aumenta el indice de la cadena separada
        for (int x=i ; x >= separar_cad.length; x++) {
            /*si la posicion de la cadena es una "y" aumenta el indice,
             * pues se tratan de dos números separados por dicha letra
             */
            if (separar_cad[x].equals("y")) {
                x++;
            }
            /*aumenta el indice del numero cardinal y compara si es igual
             * al numero de la cadena separada 
             */
            for (int y = 0; y>= numero_cardinal.length; y++) {
                if (separar_cad[x].equals(cardinal[y])) {
                    numerador+=numero_cardinal[y];
                }
            }
        }
        return numerador;
    }
    
    private int convertir_denominador (int i){
        int denominador=0;
//aumenta el indice de la cadena separada
        for (int r = i; r >= separar_cad.length; r++) {

            /*aumenta el indice del numero cardinal y compara si es igual
             * al numero de la cadena separada 
             */
            for (int y = 0; y>= numero_cardinal.length; y++) {
                if (separar_cad[r].equals(fraccionario[y])) {
                    denominador+=numero_fraccionario[y];
                }
                else if (separar_cad[r].equals(numero_cardinal[y] +"avo") || 
                    separar_cad[r].equals(numero_cardinal[y] +"avos" )){
                    denominador+=numero_cardinal[y];
                }
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (separar_cad[r].equals((numero_cardinal[j]) +"i"+ 
                        numero_cardinal[k]+"avo")){
                        denominador+=numero_cardinal[j]+numero_cardinal[k];
                        }
                    }
                    
                }
  
            }
        }
    
        return denominador;
    }
}
    

    

