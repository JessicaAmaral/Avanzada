/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Devolver {
    int[][] resultado;
    String[] unidad_denominador;
    String[] unidades;
    String[] decenas;
    String[] centenas;
    
    String resultado_num;
    String resultado_den;
    
    
    public Devolver() {
    resultado = new int[2][4];
        unidad_denominador = new String[]{"","enteros","medios","tercios","cuartos",
        "quintos","sextos","septimos","octavos","novenos"};
        unidades = new String[]{"cero","un","dos","tres","cuatro","cinco",
        "seis","siete","ocho","nueve", "diez"};
        decenas = new String[]{"","diez","veinte","treinta","cuarenta",
        "cincuenta","sesenta","setenta","ochenta","noventa"};
        centenas = new String[]{"","cien","doscientos","trescientos",
        "cuatrocientos","quinientos","seiscientos","setecientos","ochocientos",
        "novecientos"};
        
    }
    
    public void Convertir(int res_numerador, int res_denominador)
    {
        /*Separa los numeros por unidades, decenas y centenas. 
         *Envía a los elementos para su conversión a string y los imprime.
         */

        System.out.println(""+res_numerador+"/"+res_denominador);
        resultado[0][0] = res_numerador / 1000;
        resultado[0][1] = (res_numerador % 1000) / 100;
        resultado[0][2]  = (res_numerador % 100) / 10;
        resultado[0][3] = (res_numerador % 10);
        resultado[1][0] = res_denominador / 1000;
        resultado[1][1] = (res_denominador % 1000) / 100;
        resultado[1][2]  = (res_denominador % 100) / 10;
        resultado[1][3] = (res_denominador % 10);
        convertir_numerador();
        convertir_denominador();
        System.out.println(""+resultado_num+" "+resultado_den);
    }
    /**
     * Convierte entero a string usando los arreglos antes definidos
     * según unidades, decenas y centenas.
     */
    
    public void convertir_numerador()
    {
        /**
         * Hace las comparaciones correspondientes con todas las unidades.
         */
        resultado_num="";
        if(resultado[0][0]>=1)
        {
            if(resultado[0][0]==1)
                resultado_num+="mil ";
            else
                resultado_num+=unidades[resultado[0][0]]+" mil ";
        }
        if(resultado[0][1]>=1)
        {
            if(resultado[0][1]==1&&(resultado[0][2]>=1||resultado[0][3]>=1))
                resultado_num+="ciento ";
            else
                resultado_num+=centenas[resultado[0][1]]+" ";
        }
        if(resultado[0][2]>=1)
        {
            if(resultado[0][2]==1)
            {
                if(resultado[0][3]==0)
                    resultado_num+="diez";
                if(resultado[0][3]==1)
                    resultado_num+="once";
                if(resultado[0][3]==2)
                    resultado_num+="doce";
                if(resultado[0][3]==3)
                    resultado_num+="trece";
                if(resultado[0][3]==4)
                    resultado_num+="catorce";
                if(resultado[0][3]==5)
                    resultado_num+="quince";
                if(resultado[0][3]>=6)
                    resultado_num+="dieci";
            }
            else if(resultado[0][2]==2)
            {
                if(resultado[0][3]>=1)
                    resultado_num+="veinti";
                else
                    resultado_num+="veinte";
            }
            else if(resultado[0][3]==0)
            {
                resultado_num+=decenas[resultado[0][2]];
            }
            else
            {
                resultado_num+=decenas[resultado[0][2]]+" y ";
            }
        }
        if (resultado[0][3]>=1)
        {
            if((resultado[0][2]==1 && resultado[0][3]>=6)||(resultado[0][2]==2)
                ||(resultado[0][2]>=3)||(resultado[0][0]==0||resultado[0][1]==0
                ||resultado[0][2]==0))
                resultado_num+=unidades[resultado[0][3]];
        }
    }
    
    public void convertir_denominador()
    {
        resultado_den="";
        if(resultado[1][0]>=1)
        {
            if(resultado[1][1]==0&&resultado[1][2]==0&&resultado[1][3]==0)
                resultado_den+=unidades[resultado[1][0]]+"milesimos";
            else if(resultado[1][0]==1)
                resultado_den+="mil";
            else
                resultado_den+=unidades[resultado[1][0]]+"mil";
        }
        if(resultado[1][1]>=1)
        {
            if(resultado[1][1]==1&&resultado[1][2]==0&&resultado[1][3]==0)
                resultado_den+="centesimos";
            else if(resultado[1][1]==1&&(resultado[1][2]>=1||resultado[1][3]>=1))
                resultado_den+="ciento";
            else if(resultado[1][1]>=2&&resultado[1][2]==0&&resultado[1][3]==0)
                resultado_den+=centenas[resultado[1][1]]+"vos";
            else
                resultado_den+=centenas[resultado[1][1]];
        }
        if(resultado[1][2]>=1)
        {
            if(resultado[1][2]==1)
            {
                if(resultado[1][3]==0&&(resultado[1][0]==0&&resultado[1][1]==0))
                    resultado_den+="decimos";
                else if(resultado[1][3]==0)
                    resultado_den+="diezavos";
                else if(resultado[1][3]==1)
                    resultado_den+="onceavos";
                else if(resultado[1][3]==2)
                    resultado_den+="doceavos";
                else if(resultado[1][3]==3)
                    resultado_den+="treceavos";
                else if(resultado[1][3]==4)
                    resultado_den+="catorceavos";
                else if(resultado[1][3]==5)
                    resultado_den+="quinceavos";
                else if(resultado[1][3]>=6)
                    resultado_den+="dieci";
            }
            else if(resultado[1][2]==2)
            {
                if(resultado[1][3]==0)
                    resultado_den+="veinteavos";
                else
                    resultado_den+="veinti";
            }
            else if(resultado[1][3]==0)
            {
                resultado_den+=decenas[resultado[1][2]]+"vos";
            }
            else
            {
                resultado_den+=decenas[resultado[1][2]]+"i";
            }
        }
        if (resultado[1][3]>=1)
        {
            if((resultado[1][2]==1 && resultado[1][3]>=6)||(resultado[1][2]==2)||(resultado[1][2]>=3))
                resultado_den+=unidades[resultado[1][3]]+"vos";
            else if(resultado[1][0]==0&&resultado[1][1]==0&&resultado[1][2]==0)
                resultado_den+=unidad_denominador[resultado[1][3]];
        }
    }
}
