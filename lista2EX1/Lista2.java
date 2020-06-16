
package lista2EX1;
 /**
 *
 * @author Carlos
 */
import java.util.Scanner;

public class Lista2 {

    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        System.out.println("Digite um numero para saber o fatorial");
        
        //Fatorial n = new Fatorial();
        
        System.out.println(Fatorial.fatorial(input.nextInt()));
        
        
    }
    }
    
