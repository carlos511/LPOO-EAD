/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2EX1;
 /**
 *
 * @author Carlos
 */
public class Fatorial {
    public static int fatorial(int n){
       if(n == 0){
           return 1;
       }         
       
       return n * fatorial(n - 1);
        
    }
    
}
