package endereco;
// * @author WilliamSena
public class Endereco {
    
    private TipoLogradouro logradouro;
    private String numero;
    private String complemento;
    private Bairro bairro;
    private Cep cep;

    public Endereco(TipoLogradouro logradouro, String numero, String complemento, Bairro bairro, Cep cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }

    public TipoLogradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(TipoLogradouro logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco:" + logradouro + "Nº" + numero + "Complemento:" + complemento + "Bairro:" + bairro + "cep=" + cep + '}';
    }
    
    
}
