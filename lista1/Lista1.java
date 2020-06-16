
package lista1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Lista1 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);         
       ArrayList<Smartphone> c = new ArrayList<Smartphone>();
               
                
        String x;
        x = JOptionPane.showInputDialog("Adicionar ao Carrinho:\n 1-Comprar \n 2-Excluir","Digite opção");
        switch(x){
            case "1":
                String n1;
                n1 = JOptionPane.showInputDialog("Digite celular ou smartphone");
                String n2;
                n2 = JOptionPane.showInputDialog("Digite cor");
                String n3;
                n3 = JOptionPane.showInputDialog("Digite Quantidade de chip");
                String n4;
                n4 = JOptionPane.showInputDialog("Digite qual frequência GSM, 3G, 4G ou 4.5G");
                Smartphone a = new Smartphone(true, n1, n2, n3, n4);
                c.add(a);
            break;
            case "2":
                n1 = JOptionPane.showInputDialog("Você deseja realmente excluir produto ?","Digite sim ou nao");
                if(n1=="sim"){
                    c.remove(1);
                }else{
                    JOptionPane.showMessageDialog(null, "Cancelado");
                }
                
        }
        int s=c.size();
        for(int i=0; i<s ;i++){
            JOptionPane.showMessageDialog(null, c.get(i).toString());
            JOptionPane.showMessageDialog(null, c.get(i).getFormato(), x, i);
        }
    }
}
    

