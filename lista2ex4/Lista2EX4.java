
package lista2ex4;

/**
 *
 * @author Carlos
 */
public class Lista2EX4 {

    public static void main(String[] args) {
        int i[]= {2,2,2,2,2};
        
       
             int result =   inteiros(i, 0);
             
             System.out.println(result);
        for(int s=0; s  < 10; s++){
            //System.out.println(inteiros(i[s], 0));
        }
    }
    
    public static int inteiros(int i[], int s){
                
        if(s< i.length){
            return i[s] + inteiros(i, s +1);
        }
        return  0;
    }
}

    

