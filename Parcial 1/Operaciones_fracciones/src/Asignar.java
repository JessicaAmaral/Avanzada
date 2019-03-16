

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
    int x, operacion;
    
    public Asignar(){
        /**
         * cardinal guarda los números cardinales (en string) necesarios para hacer 
         * conversiones con base en su patrón de repetición.
         * numero_cardinal guarda los números correspondientes al anterior 
         * string según el valor al que pertenezca el nombre en su misma posición.
         * El mismo caso sucede con fraccionario (guarda los números fraccionarios
         * que no tienen un patrón y su número correspondiente en un arreglo de enteros).
         */
        
        cardinal = new String[]{"cero","un","dos","tres","cuatro","cinco","seis",
        "siete","ocho","nueve","diez","once","doce","trece","catorce","quince",
        "dieciseis","diecisiete","dieciocho","diecinueve","veinte","veintiun",
        "veintidos","veintitres","veinticuatro","veinticinco","veintiseis",
        "veintisiete","veintiocho","veintinueve","treint","cuarent","cincuent"
        ,"sesent","setent","ochent","novent","treinta","cuarenta","cincuenta"
        ,"sesenta","setenta","ochenta","noventa","cien"};
        
        numero_cardinal = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17
        ,18,19,20,21,22,23,24,25,26,27,28,29,30,40,50,60,70,80,90,30,40,50,60,70,
        80,90,100};
        
        fraccionario = new String[]{"entero","medio","tercio","cuarto",
        "quinto","sexto","septimo","octavo","noveno","decimo","centesimo"};
        
        numero_fraccionario = new int[]{1,2,3,4,5,6,7,8,9,10,100};
    }

    public void reemplazar (String cadena){
        int numerador1=0, numerador2=0, denominador1=0, denominador2=0, i=0;
        separar_cad= cadena.split(" ");
        
        /**
         * Encuentra los operadores y envía un número según el caso.
         */
        for (i=0; i < separar_cad.length; i++) {
            if (separar_cad[i].equals("mas")) {
                operacion =1;
                break;
            }
            else if (separar_cad[i].equals("menos")) {
                operacion = 2;
                break;
            }
            else if (separar_cad[i].equals("por")) {
                operacion = 3;
                break;
            }
            else if (separar_cad[i].equals("entre")) {
                operacion = 4;
                break;
            }
        }
        
        /**
         * Se convierten los numeradores y denominadores a entero.
         * Se envía a las funciones de convertir el inicio y final 
         * de la cadena a la que corresponde el segmento de fracción
         * a convertir.
         */
            numerador1=convertir_numerador (0, i-1);
            denominador1=convertir_denominador (0, i-1);
            numerador2=convertir_numerador (i+1,separar_cad.length-1 );
            denominador2=convertir_denominador (i+1, separar_cad.length-1);
        
            Operaciones resolver;
            resolver = new Operaciones();
            resolver.Resuelve(numerador1,denominador1,operacion,numerador2,denominador2);
    }
    
    private int convertir_numerador (int i, int f){
        int numerador=0;
        
//aumenta el indice de la cadena separada
        for (int x=i ; x <= f; x++) {
            /*si la posicion de la cadena es una "y" aumenta el indice,
             * pues se tratan de dos números separados por dicha letra
             */
            if (separar_cad[x].equals("y")) {
                x++;
            }
            /*aumenta el indice del numero cardinal y compara si es igual
             * al numero de la cadena separada 
             */
            for (int y = 0; y < cardinal.length; y++) {
                if (separar_cad[x].equals(cardinal[y])) {
                    numerador+=numero_cardinal[y];
                    break;
                }
                
            }
        }
        System.out.println(numerador);
        return numerador;
    }
    
    private int convertir_denominador (int i, int f){
        int denominador=0;
//for que aumenta el indice de la cadena separada
        for (int r = i; r <= f; r++) {

            /* for que aumenta el indice del numero cardinal y compara si es igual
             * al numero de la cadena separada. 
             */
            for (int y = 0; y< cardinal.length-1; y++) {
                if (separar_cad[r].equals(cardinal[y] +"avo") || 
                    separar_cad[r].equals(cardinal[y] +"avos" )){
                    denominador+=numero_cardinal[y];
                    break;
                }
            }
            /**
             * Para los casos que tengan una "i" entre un número y otro
             * ademas de terminar en "avo" o "avos". Por ejemplo
             * noventa i nueve avos
             */
                for (int j = 0; j < cardinal.length-1; j++) {
                    for (int k = 0; k < cardinal.length-1; k++) {
                        if (separar_cad[r].equals((cardinal[j]) +"i"+ 
                        cardinal[k]+"avo")||separar_cad[r].equals
                        (cardinal[j]+"i"+cardinal[k]+"avos")){
                        denominador+=numero_cardinal[j]+numero_cardinal[k];
                        break;
                        }
                    }                    
                } 
            }
        /**
         * Para los denominadores únicos en su forma fraccionaria (terminados o 
         * no en "s"). 
         * Por ejemplo "décimos", que no se escribe como el cardinal "diez".
         */
        for (int r = i; r <= f; r++) {
            for (int j = 0; j < fraccionario.length-1; j++) {
                if (separar_cad[r].equals(fraccionario[j])||
                    separar_cad[r].equals(fraccionario[j] +"s")) {
                denominador+=numero_fraccionario[j];
                break;
                }  
            }
        }
        System.out.println(denominador);
        return denominador;
    
    }
}
    

    

