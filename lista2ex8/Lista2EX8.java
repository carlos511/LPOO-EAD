
package lista2ex8;

/**
 *
 * @author Carlos
 */
public class Lista2EX8 {


    public static void main(String[] args) {
int n1 = 5;
        int n2 = 5;
        
        System.out.println(mult_Rec(n1, n2));
        
    }
    
    public static int mult_Rec(int n1, int n2){
        if(n2 > 0){
            return n1+ mult_Rec(n1, n2-1);
        }
         return 0;
        
    }
    
    
}
