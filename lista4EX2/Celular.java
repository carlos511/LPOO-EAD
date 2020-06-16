
package lista1;

/**
 *
 * @author Carlos
 */
public class Celular extends Telefone {
    String qchip;
    private String freq;
    
    public Celular(String qchip, String freq, String formato, String cor){
        super(formato,cor);
        this.qchip = qchip;
        this.freq = freq;
            
    }

    public String getQchip() {
        return qchip;
    }

    public void setQchip(String qchip) {
        this.qchip = qchip;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Telefone{" + "Modelo=" + qchip + ", Cor=" + freq + '}';
    }
}
