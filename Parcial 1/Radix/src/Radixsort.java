
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Radixsort {

    public void Radixsort (int[] array) {
        
          List<Integer>[] buckets = new ArrayList[10];
          for (int i = 0; i < buckets.length; i++) {
              buckets[i] = new ArrayList<Integer>();
          }
         
          boolean flag = false;
          int tmp = -1, divisor = 1;
          while (!flag) {
              flag = true;
            // separa el array en listas
            for (Integer i : array) {
              tmp = i / divisor;
              buckets[tmp % 10].add(i);
              if (flag && tmp > 0) {
                  flag = false;
              }
            }
            // vacía las listas en el array
            int a = 0;
            for (int b = 0; b < 10; b++) {
              for (Integer i : buckets[b]) {
                array[a++] = i;
              }
              buckets[b].clear();
            }
            // mueve al siguiente dígito
            divisor *= 10;
          }
        }
 
    }
    
    
    

