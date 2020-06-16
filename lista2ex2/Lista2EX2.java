
package lista2ex2;

import java.util.Scanner;

 /**
 *
 * @author Carlos
 */
public class Lista2EX2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        
        System.out.println("Digite o numero: ");
        int n1 = inp.nextInt();
        for (int i = 0; i<n1; i++){
        System.out.print(SequenciaDeFibonacci.fibonacci(i)+" ");
        }
    }
    
}
