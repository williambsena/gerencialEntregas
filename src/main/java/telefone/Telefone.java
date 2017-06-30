package telefone;
// * @author WilliamSena

public class Telefone {

    private CodigoDeArea codigoDeArea;
    private String numero;
    private TpTelefone tipo;

    public Telefone(CodigoDeArea codigoDeArea, String numero, TpTelefone tipo) {
        this.codigoDeArea = codigoDeArea;
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone.: (" + codigoDeArea + ") " + numero + "Tp.:" + tipo;
    }

    public CodigoDeArea getCodigoDeArea() {
        return codigoDeArea;
    }

    public void setCodigoDeArea(CodigoDeArea codigoDeArea) {
        this.codigoDeArea = codigoDeArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TpTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TpTelefone tipo) {
        this.tipo = tipo;
    }

}