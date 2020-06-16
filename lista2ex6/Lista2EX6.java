/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex6;

import java.util.Arrays;

/**
 *
 * @author Carlos
 */
public class Lista2EX6 {

   
    public static void main(String[] args) {
        Integer [] vetor = new Integer[100];
        int cont = 2;
        for(int i = 0; i < 100; i++){
            
            vetor[i] = cont + i;
        }
        
        inversao(vetor, 0, vetor.length-1);
        System.out.println(Arrays.toString(vetor));
        
        
        
    }
    
    public static double inversao(Integer[] vetor, int i,int f){
              
        if(i< f){
            trocar(vetor,i,f); 
            inversao(vetor, i+1, f-1);
             
        }else{
            return 0;
        }
        return 0;
    }

    private static void trocar(Integer[] vetor, int i, int f) {
        int aux = vetor[i];
        vetor[i] = vetor[f];
        vetor[f] = aux;
    }

}
    

