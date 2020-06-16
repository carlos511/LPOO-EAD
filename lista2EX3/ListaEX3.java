
package lista2EX3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ListaEX3 {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Digite um inteiro para ser invertido");
        int n1 = inp.nextInt();
        
        int result = Inversao.inverte(n1, 0);
        System.out.println(result);
    }
}
    
