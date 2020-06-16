
package lista2ex9;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Lista2EX9 {


    public static void main(String[] args) {
naturais(5);
    }
   public static void naturais(int n){
  if (n>0){
   naturais(n-1);
   if(n>0){    
    System.out.println(n);
}  
  }
   }
}
