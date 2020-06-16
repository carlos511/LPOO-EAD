
package lista2EX3;

/**
 *
 * @author Carlos
 */
public class Inversao {
    public static int inverte(int n, int s){
        if (n == 0){
            return s;
        }
        
        return inverte(n/10, s * 10 + n%10);
    }
}
