
package lista3ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Lista3EX1 {

    public static void main(String[] args) {
    LinkedIntList l1 = new LinkedIntList();
        LinkedIntList l2 = new LinkedIntList();
        LinkedIntList l3 = new LinkedIntList();
        
       // int valor = 10;
       for(int i = 10; i> 0; i--){
          // if(l1.empty()){
               l1.addFirst(i);        
           
       }
       l1.print();
       
       for(int i = l1.size(); i>0; i--){
           if(i==l1.size()){
           l2.addFirst(l1.get(0));
           }else{
               l2.addFirst(l1.get(i));
           }
           
       }
       
        System.out.println("");
        
        l2.print();
        
        System.out.println("");
        
        for(int i = 0; i<l1.size(); i++){
            l3.addFirst(l1.get(i)-1);
        }
        
        l3.print();
        
    }
}

