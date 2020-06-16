
package lista2ex5;

/**
 *
 * @author Carlos
 */
public class Lista2EX5 {

    public static void main(String[] args) {
        int result = somatoria(5);
        System.out.println(result);
    }
    public static int somatoria(int n){
        if(n > 0){
            return n + somatoria(n-1);
        }
        return 0;
    }
    
}
