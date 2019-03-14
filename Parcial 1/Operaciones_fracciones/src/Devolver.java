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
    int[][] res;
    String[] unidades_d;
    String[] unidades;
    String[] decenas;
    String[] centenas;
    
    String Num_res;
    String Den_res;
    
    public Devolver() {
    res = new int[2][4];
        unidades_d = new String[]{"","enteros","medios","tercios","cuartos","quintos","sextos","septimos","octavos","novenos"};
        unidades = new String[]{"cero","un","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        decenas = new String[]{"","diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
        centenas = new String[]{"","cien","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
    }
    
    public void Convertir(int resNum, int resDen)
    {
        System.out.println(""+resNum+"/"+resDen);
        res[0][0] = resNum / 1000;
        res[0][1] = (resNum % 1000) / 100;
        res[0][2]  = (resNum % 100) / 10;
        res[0][3] = (resNum % 10);
        res[1][0] = resDen / 1000;
        res[1][1] = (resDen % 1000) / 100;
        res[1][2]  = (resDen % 100) / 10;
        res[1][3] = (resDen % 10);
        convNum();
        convDen();
        System.out.println(""+Num_res+" "+Den_res);
    }
    
    public void convNum()
    {
        Num_res="";
        if(res[0][0]>=1)
        {
            if(res[0][0]==1)
                Num_res+="mil ";
            else
                Num_res+=unidades[res[0][0]]+" mil ";
        }
        if(res[0][1]>=1)
        {
            if(res[0][1]==1&&(res[0][2]>=1||res[0][3]>=1))
                Num_res+="ciento ";
            else
                Num_res+=centenas[res[0][1]]+" ";
        }
        if(res[0][2]>=1)
        {
            if(res[0][2]==1)
            {
                if(res[0][3]==0)
                    Num_res+="diez";
                if(res[0][3]==1)
                    Num_res+="once";
                if(res[0][3]==2)
                    Num_res+="doce";
                if(res[0][3]==3)
                    Num_res+="trece";
                if(res[0][3]==4)
                    Num_res+="catorce";
                if(res[0][3]==5)
                    Num_res+="quince";
                if(res[0][3]>=6)
                    Num_res+="dieci";
            }
            else if(res[0][2]==2)
            {
                if(res[0][3]>=1)
                    Num_res+="veinti";
                else
                    Num_res+="veinte";
            }
            else if(res[0][3]==0)
            {
                Num_res+=decenas[res[0][2]];
            }
            else
            {
                Num_res+=decenas[res[0][2]]+" y ";
            }
        }
        if (res[0][3]>=1)
        {
            if((res[0][2]==1 && res[0][3]>=6)||(res[0][2]==2)||(res[0][2]>=3)||(res[0][0]==0||res[0][1]==0||res[0][2]==0))
                Num_res+=unidades[res[0][3]];
        }
    }
    
    public void convDen()
    {
        Den_res="";
        if(res[1][0]>=1)
        {
            if(res[1][1]==0&&res[1][2]==0&&res[1][3]==0)
                Den_res+=unidades[res[1][0]]+"milesimos";
            else if(res[1][0]==1)
                Den_res+="mil";
            else
                Den_res+=unidades[res[1][0]]+"mil";
        }
        if(res[1][1]>=1)
        {
            if(res[1][1]==1&&res[1][2]==0&&res[1][3]==0)
                Den_res+="centesimos";
            else if(res[1][1]==1&&(res[1][2]>=1||res[1][3]>=1))
                Den_res+="ciento";
            else if(res[1][1]>=2&&res[1][2]==0&&res[1][3]==0)
                Den_res+=centenas[res[1][1]]+"avos";
            else
                Den_res+=centenas[res[1][1]];
        }
        if(res[1][2]>=1)
        {
            if(res[1][2]==1)
            {
                if(res[1][3]==0&&(res[1][0]==0&&res[1][1]==0))
                    Den_res+="decimos";
                else if(res[1][3]==0)
                    Den_res+="diezavos";
                else if(res[1][3]==1)
                    Den_res+="onceavos";
                else if(res[1][3]==2)
                    Den_res+="doceavos";
                else if(res[1][3]==3)
                    Den_res+="treceavos";
                else if(res[1][3]==4)
                    Den_res+="catorceavos";
                else if(res[1][3]==5)
                    Den_res+="quinceavos";
                else if(res[1][3]>=6)
                    Den_res+="dieci";
            }
            else if(res[1][2]==2)
            {
                if(res[1][3]==0)
                    Den_res+="veinteavos";
                else
                    Den_res+="veinti";
            }
            else if(res[1][3]==0)
            {
                Den_res+=decenas[res[1][2]]+"avos";
            }
            else
            {
                Den_res+=decenas[res[1][2]]+"i";
            }
        }
        if (res[1][3]>=1)
        {
            if((res[1][2]==1 && res[1][3]>=6)||(res[1][2]==2)||(res[1][2]>=3))
                Den_res+=unidades[res[1][3]]+"avos";
            else if(res[1][0]==0&&res[1][1]==0&&res[1][2]==0)
                Den_res+=unidades_d[res[1][3]];
        }
    }
}
