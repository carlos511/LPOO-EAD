
package lista1;

/**
 *
 * @author Carlos
 */
public class Smartphone extends Celular {
    private boolean touch;
    
    public Smartphone(boolean touch,String formato, String cor, String qchip, String freq){
        super(formato,cor, qchip,freq);
        this.touch = touch;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
    }
    public boolean precisaTouch(){
        return touch;
        }
}
