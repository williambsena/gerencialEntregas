
package telefone;
// * @author WilliamSena
public class CodigoDeArea {
    private Integer numero;

    public CodigoDeArea(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + numero + ')';
    }
    
}
