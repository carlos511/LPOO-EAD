
package lista1;

/**
 *
 * @author Carlos
 */
public class Telefone {
    protected String formato;
    protected String cor;

    public Telefone(String formato, String cor) {
        this.formato = formato;
        this.cor = cor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "formato=" + formato + ", cor=" + cor + '}';
    }
}
