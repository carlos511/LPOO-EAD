
package lista2ex2;
/**
 *
 * @author Carlos
 */
public class SequenciaDeFibonacci {
     public static int fibonacci(int n){
        
        if(n < 2){
            return 1;
        }
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
