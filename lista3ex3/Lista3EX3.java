
package lista3ex3;

/**
 *
 * @author Carlos
 */
public class Lista3EX3 {

    public static void main(String[] args) {
        LinkedIntList l1 = new LinkedIntList();
        LinkedIntList l2 = new LinkedIntList();
        
        
        l1.addFirst("uol", "uol.com.br");
        l1.addFirst("facebook", "facebook.com.br");
        l1.addFirst("youtube", "youtube.com.br");
        
        //l1.print();
        l1.getNomeFist("google");
        
        l1.print();
        
    }
}
