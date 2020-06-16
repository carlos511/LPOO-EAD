
package lista5ex1;

/**
 *
 * @author Carlos
 */
public class Lista5EX1 {

    public static void main(String[] args) {
        LinkedIntList l1 = new LinkedIntList();
        LinkedIntList l2 = new LinkedIntList();
        LinkedIntList l3 = new LinkedIntList();
        
        for(int i = 10; i>0 ; i--){
            l1.addFirst(i);  
        }
        for(int i = 0; i<10 ; i++){
            l2.addFirst(i);  
        }
        
        
        l1.verifElement(11);
        
        l1.add(56, 6);
        
        l1.remove(6);
       
        l1.print();
        System.out.println("Elemento");
        
        l3.copyList(l1, l3);
        
        l3.print();
        
        System.out.println("Elemento");
        
        l1.concatenarList(l1, l2);
        
       l1.print();
    }
    
}
